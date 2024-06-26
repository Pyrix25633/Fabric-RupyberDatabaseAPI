/*
 * This file is generated by jOOQ.
 */
package net.rupyber_studios.rupyber_database_api.jooq;


import net.rupyber_studios.rupyber_database_api.jooq.tables.EmergencyCallNumbersTable;
import net.rupyber_studios.rupyber_database_api.jooq.tables.EmergencyCallsTable;
import net.rupyber_studios.rupyber_database_api.jooq.tables.IncidentNumbersTable;
import net.rupyber_studios.rupyber_database_api.jooq.tables.IncidentPlayersTable;
import net.rupyber_studios.rupyber_database_api.jooq.tables.IncidentTypesTable;
import net.rupyber_studios.rupyber_database_api.jooq.tables.IncidentsTable;
import net.rupyber_studios.rupyber_database_api.jooq.tables.PlayersTable;
import net.rupyber_studios.rupyber_database_api.jooq.tables.PrioritiesTable;
import net.rupyber_studios.rupyber_database_api.jooq.tables.RanksTable;
import net.rupyber_studios.rupyber_database_api.jooq.tables.RecipientsTable;
import net.rupyber_studios.rupyber_database_api.jooq.tables.ResponseCodesTable;
import net.rupyber_studios.rupyber_database_api.jooq.tables.RolesTable;
import net.rupyber_studios.rupyber_database_api.jooq.tables.StatusLogsTable;
import net.rupyber_studios.rupyber_database_api.jooq.tables.StatusesTable;
import net.rupyber_studios.rupyber_database_api.jooq.tables.records.EmergencyCallNumbersRecord;
import net.rupyber_studios.rupyber_database_api.jooq.tables.records.EmergencyCallsRecord;
import net.rupyber_studios.rupyber_database_api.jooq.tables.records.IncidentNumbersRecord;
import net.rupyber_studios.rupyber_database_api.jooq.tables.records.IncidentPlayersRecord;
import net.rupyber_studios.rupyber_database_api.jooq.tables.records.IncidentTypesRecord;
import net.rupyber_studios.rupyber_database_api.jooq.tables.records.IncidentsRecord;
import net.rupyber_studios.rupyber_database_api.jooq.tables.records.PlayersRecord;
import net.rupyber_studios.rupyber_database_api.jooq.tables.records.PrioritiesRecord;
import net.rupyber_studios.rupyber_database_api.jooq.tables.records.RanksRecord;
import net.rupyber_studios.rupyber_database_api.jooq.tables.records.RecipientsRecord;
import net.rupyber_studios.rupyber_database_api.jooq.tables.records.ResponseCodesRecord;
import net.rupyber_studios.rupyber_database_api.jooq.tables.records.RolesRecord;
import net.rupyber_studios.rupyber_database_api.jooq.tables.records.StatusLogsRecord;
import net.rupyber_studios.rupyber_database_api.jooq.tables.records.StatusesRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in the
 * default schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<EmergencyCallNumbersRecord> pk_EmergencyCallNumbers = Internal.createUniqueKey(EmergencyCallNumbersTable.EmergencyCallNumbers, DSL.name("pk_EmergencyCallNumbers"), new TableField[] { EmergencyCallNumbersTable.EmergencyCallNumbers.day }, true);
    public static final UniqueKey<EmergencyCallsRecord> pk_EmergencyCalls = Internal.createUniqueKey(EmergencyCallsTable.EmergencyCalls, DSL.name("pk_EmergencyCalls"), new TableField[] { EmergencyCallsTable.EmergencyCalls.id }, true);
    public static final UniqueKey<IncidentNumbersRecord> pk_IncidentNumbers = Internal.createUniqueKey(IncidentNumbersTable.IncidentNumbers, DSL.name("pk_IncidentNumbers"), new TableField[] { IncidentNumbersTable.IncidentNumbers.day }, true);
    public static final UniqueKey<IncidentsRecord> pk_Incidents = Internal.createUniqueKey(IncidentsTable.Incidents, DSL.name("pk_Incidents"), new TableField[] { IncidentsTable.Incidents.id }, true);
    public static final UniqueKey<IncidentTypesRecord> pk_IncidentTypes = Internal.createUniqueKey(IncidentTypesTable.IncidentTypes, DSL.name("pk_IncidentTypes"), new TableField[] { IncidentTypesTable.IncidentTypes.id }, true);
    public static final UniqueKey<IncidentTypesRecord> uk_IncidentTypes_100673796 = Internal.createUniqueKey(IncidentTypesTable.IncidentTypes, DSL.name("uk_IncidentTypes_100673796"), new TableField[] { IncidentTypesTable.IncidentTypes.code }, true);
    public static final UniqueKey<PlayersRecord> pk_Players = Internal.createUniqueKey(PlayersTable.Players, DSL.name("pk_Players"), new TableField[] { PlayersTable.Players.id }, true);
    public static final UniqueKey<PrioritiesRecord> pk_Priorities = Internal.createUniqueKey(PrioritiesTable.Priorities, DSL.name("pk_Priorities"), new TableField[] { PrioritiesTable.Priorities.id }, true);
    public static final UniqueKey<PrioritiesRecord> uk_Priorities_114129772 = Internal.createUniqueKey(PrioritiesTable.Priorities, DSL.name("uk_Priorities_114129772"), new TableField[] { PrioritiesTable.Priorities.priority }, true);
    public static final UniqueKey<RanksRecord> pk_Ranks = Internal.createUniqueKey(RanksTable.Ranks, DSL.name("pk_Ranks"), new TableField[] { RanksTable.Ranks.id }, true);
    public static final UniqueKey<RanksRecord> uk_Ranks_87102373 = Internal.createUniqueKey(RanksTable.Ranks, DSL.name("uk_Ranks_87102373"), new TableField[] { RanksTable.Ranks.rank }, true);
    public static final UniqueKey<RecipientsRecord> pk_Recipients = Internal.createUniqueKey(RecipientsTable.Recipients, DSL.name("pk_Recipients"), new TableField[] { RecipientsTable.Recipients.id }, true);
    public static final UniqueKey<RecipientsRecord> uk_Recipients_129587470 = Internal.createUniqueKey(RecipientsTable.Recipients, DSL.name("uk_Recipients_129587470"), new TableField[] { RecipientsTable.Recipients.recipients }, true);
    public static final UniqueKey<ResponseCodesRecord> pk_ResponseCodes = Internal.createUniqueKey(ResponseCodesTable.ResponseCodes, DSL.name("pk_ResponseCodes"), new TableField[] { ResponseCodesTable.ResponseCodes.id }, true);
    public static final UniqueKey<ResponseCodesRecord> uk_ResponseCodes_28237986 = Internal.createUniqueKey(ResponseCodesTable.ResponseCodes, DSL.name("uk_ResponseCodes_28237986"), new TableField[] { ResponseCodesTable.ResponseCodes.code }, true);
    public static final UniqueKey<RolesRecord> pk_Roles = Internal.createUniqueKey(RolesTable.Roles, DSL.name("pk_Roles"), new TableField[] { RolesTable.Roles.id }, true);
    public static final UniqueKey<RolesRecord> uk_Roles_90990481 = Internal.createUniqueKey(RolesTable.Roles, DSL.name("uk_Roles_90990481"), new TableField[] { RolesTable.Roles.role }, true);
    public static final UniqueKey<StatusesRecord> pk_Statuses = Internal.createUniqueKey(StatusesTable.Statuses, DSL.name("pk_Statuses"), new TableField[] { StatusesTable.Statuses.id }, true);
    public static final UniqueKey<StatusesRecord> uk_Statuses_75748412 = Internal.createUniqueKey(StatusesTable.Statuses, DSL.name("uk_Statuses_75748412"), new TableField[] { StatusesTable.Statuses.status }, true);
    public static final UniqueKey<StatusLogsRecord> pk_StatusLogs = Internal.createUniqueKey(StatusLogsTable.StatusLogs, DSL.name("pk_StatusLogs"), new TableField[] { StatusLogsTable.StatusLogs.id }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<EmergencyCallsRecord, PlayersRecord> fk_EmergencyCalls_pk_Players = Internal.createForeignKey(EmergencyCallsTable.EmergencyCalls, DSL.name("fk_EmergencyCalls_pk_Players"), new TableField[] { EmergencyCallsTable.EmergencyCalls.callerId }, Keys.pk_Players, new TableField[] { PlayersTable.Players.id }, true);
    public static final ForeignKey<IncidentPlayersRecord, IncidentsRecord> fk_IncidentPlayers_pk_Incidents = Internal.createForeignKey(IncidentPlayersTable.IncidentPlayers, DSL.name("fk_IncidentPlayers_pk_Incidents"), new TableField[] { IncidentPlayersTable.IncidentPlayers.incidentId }, Keys.pk_Incidents, new TableField[] { IncidentsTable.Incidents.id }, true);
    public static final ForeignKey<IncidentPlayersRecord, PlayersRecord> fk_IncidentPlayers_pk_Players = Internal.createForeignKey(IncidentPlayersTable.IncidentPlayers, DSL.name("fk_IncidentPlayers_pk_Players"), new TableField[] { IncidentPlayersTable.IncidentPlayers.playerId }, Keys.pk_Players, new TableField[] { PlayersTable.Players.id }, true);
    public static final ForeignKey<IncidentPlayersRecord, RolesRecord> fk_IncidentPlayers_pk_Roles = Internal.createForeignKey(IncidentPlayersTable.IncidentPlayers, DSL.name("fk_IncidentPlayers_pk_Roles"), new TableField[] { IncidentPlayersTable.IncidentPlayers.roleId }, Keys.pk_Roles, new TableField[] { RolesTable.Roles.id }, true);
    public static final ForeignKey<IncidentsRecord, EmergencyCallsRecord> fk_Incidents_pk_EmergencyCalls = Internal.createForeignKey(IncidentsTable.Incidents, DSL.name("fk_Incidents_pk_EmergencyCalls"), new TableField[] { IncidentsTable.Incidents.emergencyCallId }, Keys.pk_EmergencyCalls, new TableField[] { EmergencyCallsTable.EmergencyCalls.id }, true);
    public static final ForeignKey<IncidentsRecord, IncidentTypesRecord> fk_Incidents_pk_IncidentTypes = Internal.createForeignKey(IncidentsTable.Incidents, DSL.name("fk_Incidents_pk_IncidentTypes"), new TableField[] { IncidentsTable.Incidents.incidentTypeId }, Keys.pk_IncidentTypes, new TableField[] { IncidentTypesTable.IncidentTypes.id }, true);
    public static final ForeignKey<IncidentsRecord, PlayersRecord> fk_Incidents_pk_Players = Internal.createForeignKey(IncidentsTable.Incidents, DSL.name("fk_Incidents_pk_Players"), new TableField[] { IncidentsTable.Incidents.closedBy, IncidentsTable.Incidents.createdBy }, Keys.pk_Players, new TableField[] { PlayersTable.Players.id, PlayersTable.Players.id }, true);
    public static final ForeignKey<IncidentsRecord, PrioritiesRecord> fk_Incidents_pk_Priorities = Internal.createForeignKey(IncidentsTable.Incidents, DSL.name("fk_Incidents_pk_Priorities"), new TableField[] { IncidentsTable.Incidents.priorityId }, Keys.pk_Priorities, new TableField[] { PrioritiesTable.Priorities.id }, true);
    public static final ForeignKey<IncidentsRecord, RecipientsRecord> fk_Incidents_pk_Recipients = Internal.createForeignKey(IncidentsTable.Incidents, DSL.name("fk_Incidents_pk_Recipients"), new TableField[] { IncidentsTable.Incidents.recipientsId }, Keys.pk_Recipients, new TableField[] { RecipientsTable.Recipients.id }, true);
    public static final ForeignKey<IncidentsRecord, ResponseCodesRecord> fk_Incidents_pk_ResponseCodes = Internal.createForeignKey(IncidentsTable.Incidents, DSL.name("fk_Incidents_pk_ResponseCodes"), new TableField[] { IncidentsTable.Incidents.responseCodeId }, Keys.pk_ResponseCodes, new TableField[] { ResponseCodesTable.ResponseCodes.id }, true);
    public static final ForeignKey<PlayersRecord, RanksRecord> fk_Players_pk_Ranks = Internal.createForeignKey(PlayersTable.Players, DSL.name("fk_Players_pk_Ranks"), new TableField[] { PlayersTable.Players.rankId }, Keys.pk_Ranks, new TableField[] { RanksTable.Ranks.id }, true);
    public static final ForeignKey<PlayersRecord, StatusesRecord> fk_Players_pk_Statuses = Internal.createForeignKey(PlayersTable.Players, DSL.name("fk_Players_pk_Statuses"), new TableField[] { PlayersTable.Players.statusId }, Keys.pk_Statuses, new TableField[] { StatusesTable.Statuses.id }, true);
    public static final ForeignKey<StatusLogsRecord, PlayersRecord> fk_StatusLogs_pk_Players = Internal.createForeignKey(StatusLogsTable.StatusLogs, DSL.name("fk_StatusLogs_pk_Players"), new TableField[] { StatusLogsTable.StatusLogs.playerId }, Keys.pk_Players, new TableField[] { PlayersTable.Players.id }, true);
    public static final ForeignKey<StatusLogsRecord, StatusesRecord> fk_StatusLogs_pk_Statuses = Internal.createForeignKey(StatusLogsTable.StatusLogs, DSL.name("fk_StatusLogs_pk_Statuses"), new TableField[] { StatusLogsTable.StatusLogs.statusId }, Keys.pk_Statuses, new TableField[] { StatusesTable.Statuses.id }, true);
}
