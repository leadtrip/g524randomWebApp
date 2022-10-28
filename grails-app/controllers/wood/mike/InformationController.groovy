package wood.mike

class InformationController {

    def informationService

    def index() {
        [nextBirthday: howLongUntilNextBirthday(),      // howLongUntilNextBirthday is on BirthdayTrait in plugin
        dateNow: dateNow(),                             // dateNow and dateInXDays are from DateTrait in plugin
        dateIn50days: dateInXDays(50),
        domainInfo: informationService.domainInfo()]    // domainInfo is on AppInfoTrait in plugin
    }
}
