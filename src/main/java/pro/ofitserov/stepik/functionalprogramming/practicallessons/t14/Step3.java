package pro.ofitserov.stepik.functionalprogramming.practicallessons.t14;

public class Step3 {
    /**
     2.14 The chain of responsibility pattern in the functional style

     The algorithm for creating a XML request.

     0) Initial request data looks like shown below (it contains only business data).

     <type>payment</type><sum>100000</sum><order_id>e94dc619-6172-4ffe-aae8-63112c551570</order><desc>We'd like to buy an elephant</desc>
     1) First, a tag <transaction>...</transaction> is added as border of the data (data is wrapped in the tag). The result:

     <transaction><type>payment</type><sum>100000</sum><order_id>e94dc619-6172-4ffe-aae8-63112c551570</order><desc>We'd like to buy an elephant</desc></transaction>
     2) Then, a digest (MD5) is calculated for entire data created on the previous stage and added as a new tag. The result:

     <transaction><type>payment</type><sum>100000</sum><order_id>e94dc619-6172-4ffe-aae8-63112c551570</order><desc>We'd like to buy an elephant</desc></transaction><digest>CZVMYTgc3iiOdJjFP+6dhQ==</digest>
     3) After that, the data is wrapped in a tag <request>...</request> as shown below. The request is completed.

     <request><transaction><type>payment</type><sum>100000</sum><order_id>e94dc619-6172-4ffe-aae8-
     63112c551570</order><desc>We'd like to buy an elephant</desc></transaction>
     <digest>CZVMYTgc3iiOdJjFP+6dhQ==</digest></request>
     So, if you have a request data as shown in stage 0, the algorithm should to generate the result as shown in stage 3.

     Note, each stage is already implemented for you in a specific RequestHandler.
     */
}
