package remote

import spock.lang.Specification


class GetByLocationSpec extends Specification {

    def" operator get the total amount for a location"(){

        given:"a key val pair of machines ip's and locations"
        Map<String, String> operationalLocations = new HashMap<>()

        and:" an operator"
        Operator operator = new Operator()

        and:"a location"
        String maine = "maine";

        when:"operator requests total of location"
        operator.getTotalMoneyByLocation(maine)

        then:" the total is returrned"


    }
}