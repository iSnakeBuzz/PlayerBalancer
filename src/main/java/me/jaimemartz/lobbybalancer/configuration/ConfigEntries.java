package me.jaimemartz.lobbybalancer.configuration;

import me.jaimemartz.faucet.ConfigEntry;
import me.jaimemartz.faucet.ConfigEntryHolder;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConfigEntries implements ConfigEntryHolder {
    public static final ConfigEntry<Boolean> PLUGIN_ENABLED = new ConfigEntry<>(0, "settings.enabled", false);
    public static final ConfigEntry<Boolean> SILENT_STARTUP = new ConfigEntry<>(0, "settings.silent-startup", false);
    public static final ConfigEntry<Boolean> CHECK_UPDATES_ENABLED = new ConfigEntry<>(0, "settings.check-updates", true);

    public static final ConfigEntry<Boolean> SERVER_CHECK_ENABLED = new ConfigEntry<>(0, "settings.server_check.enabled", true);
    public static final ConfigEntry<String> SERVER_CHECK_MODE = new ConfigEntry<>(0, "settings.server_check.tactic", "CUSTOM");
    public static final ConfigEntry<Integer> SERVER_CHECK_ATTEMPTS = new ConfigEntry<>(0, "settings.server_check.attempts", 5);
    public static final ConfigEntry<Integer> SERVER_CHECK_INTERVAL = new ConfigEntry<>(0, "settings.server_check.interval", 10000);
    public static final ConfigEntry<Boolean> SERVER_CHECK_PRINT_INFO = new ConfigEntry<>(0, "settings.server_check.print-info", false);
    public static final ConfigEntry<List<String>> SERVER_CHECK_MARKER_MOTDS = new ConfigEntry<>(0, "settings.server_check.marker-motds", Arrays.asList("Server is not accessible", "Gamemode has already started"));

    public static final ConfigEntry<Boolean> GEOLOCATION_ENABLED = new ConfigEntry<>(0, "settings.geolocation.enabled", true);
    public static final ConfigEntry<Boolean> GEOLOCATION_PRINT_INFO = new ConfigEntry<>(0, "settings.geolocation.print-info", true);

    public static final ConfigEntry<Boolean> RECONNECT_KICK_ENABLED = new ConfigEntry<>(0, "settings.reconnect-kick.enabled", true);
    public static final ConfigEntry<Boolean> RECONNECT_KICK_INVERTED = new ConfigEntry<>(0, "settings.reconnect-kick.inverted", false);
    public static final ConfigEntry<List<String>> RECONNECT_KICK_REASONS = new ConfigEntry<>(0, "settings.reconnect-kick.reasons", Collections.emptyList());
    public static final ConfigEntry<Boolean> RECONNECT_KICK_PRINT_INFO = new ConfigEntry<>(0, "settings.reconnect-kick.print-info", false);
    public static final ConfigEntry<List<String>> RECONNECT_KICK_IGNORED_SECTIONS = new ConfigEntry<>(0, "settings.reconnect-kick.ignored", Collections.emptyList());
    public static final ConfigEntry<String> RECONNECT_KICK_MESSAGE = new ConfigEntry<>(0, "settings.reconnect-kick.message", "&cYou have been kicked from &a{from} &cand you are being moved to &a{to}&c, reason: &a{reason}");

    public static final ConfigEntry<Boolean> FALLBACK_COMMAND_ENABLED = new ConfigEntry<>(0, "settings.fallback-command.enabled", true);
    public static final ConfigEntry<String> FALLBACK_COMMAND_NAME = new ConfigEntry<>(0, "settings.fallback-command.name", "fallback");
    public static final ConfigEntry<List<String>> FALLBACK_COMMAND_ALIASES = new ConfigEntry<>(0, "settings.fallback-command.aliases", Arrays.asList("lobby", "hub", "back"));
    public static final ConfigEntry<String> FALLBACK_COMMAND_PERMISSION = new ConfigEntry<>(0, "settings.fallback-command.permission", "");
    public static final ConfigEntry<List<String>> FALLBACK_COMMAND_IGNORED_SECTIONS = new ConfigEntry<>(0, "settings.fallback-command.ignored", Collections.emptyList());
    public static final ConfigEntry<Boolean> FALLBACK_COMMAND_ARGUMENTS = new ConfigEntry<>(0, "settings.fallback-command.arguments", true);

    public static final ConfigEntry<Boolean> AUTO_RELOAD_ENABLED = new ConfigEntry<>(0, "settings.auto-reload", true);
    public static final ConfigEntry<Boolean> REDIS_BUNGEE_ENABLED = new ConfigEntry<>(0, "settings.redis-bungee", false);
    public static final ConfigEntry<Boolean> ASSIGN_TARGETS_ENABLED = new ConfigEntry<>(0, "settings.assign-targets", false);
    public static final ConfigEntry<Boolean> FALLBACK_PRINCIPAL_ENABLED = new ConfigEntry<>(0, "settings.fallback-principal", true);

    public static final ConfigEntry<String> CONNECTING_MESSAGE = new ConfigEntry<>(0, "settings.messages.connecting", "&aConnecting to {server}");
    public static final ConfigEntry<String> FAILURE_MESSAGE = new ConfigEntry<>(0, "settings.messages.failure", "&cCould not find a server to connect to");
    public static final ConfigEntry<String> UNAVAILABLE_MESSAGE = new ConfigEntry<>(0, "settings.messages.unavailable", "&cThis command cannot be executed on this server");
    public static final ConfigEntry<String> UNKNOWN_SECTION_MESSAGE = new ConfigEntry<>(0, "settings.messages.unknown", "&cCould not find a section with that name");

    public static final ConfigEntry<String> CONFIG_VERSION = new ConfigEntry<>(0, "version", null);
}