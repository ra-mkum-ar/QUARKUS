package de.schulte.smartbar.backoffice.tables;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(rolesAllowed = {"admin"})
public interface TablesResource extends PanacheEntityResource<Table, Long> {
}
