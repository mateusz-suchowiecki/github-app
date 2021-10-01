package com.example.githubapp.data.di

import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.features.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import io.ktor.http.*

private const val TIME_OUT = 60_000

internal val httpClient = HttpClient(Android) {
    defaultRequest {
        host = "api.github.com"
        url {
            protocol = URLProtocol.HTTPS
        }
    }
    install(JsonFeature) {
        serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
            prettyPrint = true
            isLenient = true
            ignoreUnknownKeys = true
        })

        engine {
            connectTimeout = TIME_OUT
            socketTimeout = TIME_OUT
        }
    }
}