package wireformats;

public interface Protocol {
    int NodeReportsOverlaySetupStatus = 0;
    int OverlayNodeReportsTaskFinished = 1;
    int OverlayNodeReportsTrafficSummary = 2;
    int OverlayNodeSendsData = 3;
    int OverlayNodeSendsDeregistration = 4;
    int OverlayNodeSendsRegistration = 5;
    int RegistryReportsDeregistrationStatus = 6;
    int RegistryReportsRegistrationStatus = 7;
    int RegistryRequestsTaskInitiate = 8;
    int RegistryRequestsTrafficSummary = 9;
    int RegistrySendsNodeManifest = 10;
}
