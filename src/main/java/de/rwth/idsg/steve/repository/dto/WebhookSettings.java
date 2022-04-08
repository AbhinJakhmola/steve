package de.rwth.idsg.steve.repository.dto;

import jooq.steve.db.tables.records.SteveSettingsRecord;
import de.rwth.idsg.steve.NotificationFeature;
import de.rwth.idsg.steve.repository.impl.SteveSettingsRepositoryImpl;
import lombok.Builder;
import lombok.Getter;
import java.util.List;

/**
 * @author Anirudh Ramesh <anirudh@irasus.com>
 * @since 05.06.2021
 */
@Getter
@Builder
public class WebhookSettings {

    private final boolean webhookEnabled;
    private final String webhook;
    private final List<NotificationFeature> enabledFeatures;
    public  List<NotificationFeature> getEnabledFeatures()
    {
        return enabledFeatures;
    }
}
