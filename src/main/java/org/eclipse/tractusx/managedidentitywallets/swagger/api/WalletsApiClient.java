package org.eclipse.tractusx.managedidentitywallets.swagger.api;

import org.eclipse.tractusx.managedidentitywallets.swagger.configuration.ClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(contextId="WalletsApiClient", name="${managedIdentityWallets_.name:managedIdentityWallets_}", url="${managedIdentityWallets_.url:/}", configuration = ClientConfiguration.class)
public interface WalletsApiClient extends WalletsApi {
}
