/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedScdnAclRule extends AbstractModel{

    /**
    * 匹配关键字：
protocol：HTTP协议
httpVersion：HTTP版本
method：请求方法
ip：请求源IP
ipAsn：请求源IP自治域号
ipCountry：请求源IP所在国家
ipArea：请求源IP所在大区
xForwardFor：请求头X-Forward-For
directory：路径
index：首页
path：文件全路径
file：文件扩展名
param：请求参数
referer：请求头Referer
cookie：请求头Cookie
userAgent：请求头User-Agent
head：自定义请求头
    */
    @SerializedName("MatchKey")
    @Expose
    private String MatchKey;

    /**
    * 逻辑操作符，取值如下：
不包含：exclude
包含：include
不等于：notequal
等于：equal
前缀匹配：matching
内容为空或不存在：null
    */
    @SerializedName("LogicOperator")
    @Expose
    private String LogicOperator;

    /**
    * 匹配值。
当MatchKey为protocol时
取值：HTTP、HTTPS

当MatchKey为httpVersion时
取值：HTTP/1.0、HTTP/1.1、HTTP/1.2、HTTP/2、HTTP/3

当MatchKey为method时
取值：HEAD、GET、POST、PUT、OPTIONS、TRACE、DELETE、PATCH、CONNECT

当MatchKey为ipCountry时，取值为：
其他：OTHER
委内瑞拉：VE
乌拉圭：UY
苏里南：SR
巴拉圭：PY
秘鲁：PE
圭亚那：GY
厄瓜多尔：EC
哥伦比亚：CO
智利：CL
巴西：BR
玻利维亚：BO
阿根廷：AR
新西兰：NZ
萨摩亚：WS
瓦努阿图：VU
图瓦卢：TV
汤加：TO
托克劳：TK
帕劳：PW
纽埃：NU
瑙鲁：NR
基里巴斯：KI
关岛：GU
密克罗尼西亚：FM
澳大利亚：AU
美国：US
波多黎各：PR
多米尼加共和国：DO
哥斯达黎加：CR
东萨摩亚：AS
安提瓜和巴布达：AG
巴拿马：PA
尼加拉瓜：NI
墨西哥：MX
牙买加：JM
海地：HT
洪都拉斯：HN
危地马拉：GT
瓜德罗普岛：GP
格陵兰：GL
格林纳达：GD
古巴：CU
加拿大：CA
伯利兹：BZ
巴哈马：BS
百慕大：BM
巴巴多斯：BB
阿鲁巴：AW
安圭拉：AI
梵蒂冈：VA
斯洛伐克：SK
俄罗斯：RU
英国：GB
捷克共和国：CZ
乌克兰：UA
土耳其：TR
斯洛文尼亚：SI
瑞典：SE
塞尔维亚：RS
罗马尼亚：RO
葡萄牙：PT
波兰：PL
挪威：NO
荷兰：NL
马耳他：MT
马其顿：MK
黑山：ME
摩尔多瓦：MD
摩纳哥：MC
拉脱维亚：LV
卢森堡：LU
立陶宛：LT
列支敦士登：LI
哈萨克斯坦：KZ
意大利：IT
冰岛：IS
爱尔兰：IE
匈牙利：HU
克罗地亚：HR
希腊：GR
直布罗陀：GI
根西岛：GG
格鲁吉亚：GE
法国：FR
芬兰：FI
西班牙：ES
爱沙尼亚：EE
丹麦：DK
德国：DE
塞浦路斯：CY
瑞士：CH
白俄罗斯：BY
保加利亚：BG
比利时：BE
阿塞拜疆：AZ
奥地利：AT
亚美尼亚：AM
阿尔巴尼亚：AL
安道尔：AD
东帝汶：TL
叙利亚：SY
沙特阿拉伯：SA
巴勒斯坦：PS
斯里兰卡：LK
斯里兰卡：LK
朝鲜：KP
吉尔吉斯斯坦：KG
中国香港：HK
文莱：BN
孟加拉：BD
阿联酋：AE
也门：YE
越南：VN
乌兹别克斯坦：UZ
中国台湾：TW
土库曼斯坦：TM
塔吉克斯坦：TJ
泰国：TH
新加坡：SG
卡塔尔：QA
巴基斯坦：PK
菲律宾：PH
阿曼：OM
尼泊尔：NP
马来西亚：MY
马尔代夫：MV
中国澳门：MO
蒙古：MN
缅甸：MM
黎巴嫩：LB
科威特：KW
韩国：KR
柬埔寨：KH
日本：JP
约旦：JO
伊朗：IR
伊拉克：IQ
印度：IN
以色列：IL
印度尼西亚：ID
中国：CN
不丹：BT
巴林：BH
阿富汗：AF
利比亚：LY
刚果金：CG
留尼汪岛：RE
斯威士兰：SZ
津巴布韦：ZW
赞比亚：ZM
马约特：YT
乌干达：UG
坦桑尼亚：TZ
突尼斯：TN
多哥：TG
乍得：TD
索马里：SO
塞内加尔：SN
苏丹：SD
塞舌尔：SC
卢旺达：RW
尼日利亚：NG
尼日尔：NE
纳米比亚：NA
莫桑比克：MZ
马拉维：MW
毛里求斯：MU
毛里塔尼亚：MR
马里：ML
马达加斯加：MG
摩洛哥：MA
莱索托：LS
利比里亚：LR
科摩罗：KM
肯尼亚：KE
几内亚：GN
冈比亚：GM
加纳：GH
加蓬：GA
埃塞俄比亚：ET
厄立特里亚：ER
埃及：EG
阿尔及利亚：DZ
吉布提：DJ
喀麦隆：CM
刚果：CG
博茨瓦纳：BW
贝宁：BJ
布隆迪：BI
安哥拉：AO

当MatchKey为ipArea时，取值为：
其他：OTHER
亚洲：AS
欧洲：EU
南极洲：AN
非洲：AF
大洋洲：OC
北美洲：NA
南美洲：SA

当MatchKey为index时
取值为：/;/index.html
    */
    @SerializedName("MatchValue")
    @Expose
    private String [] MatchValue;

    /**
    * 是否区分大小写 true：区分 false：不区分
    */
    @SerializedName("CaseSensitive")
    @Expose
    private Boolean CaseSensitive;

    /**
    * 当MatchKey为param时必填：表示请求参数Key 当MatchKey为cookie时必填：表示请求头Cookie中参数的
    */
    @SerializedName("MatchKeyParam")
    @Expose
    private String MatchKeyParam;

    /**
     * Get 匹配关键字：
protocol：HTTP协议
httpVersion：HTTP版本
method：请求方法
ip：请求源IP
ipAsn：请求源IP自治域号
ipCountry：请求源IP所在国家
ipArea：请求源IP所在大区
xForwardFor：请求头X-Forward-For
directory：路径
index：首页
path：文件全路径
file：文件扩展名
param：请求参数
referer：请求头Referer
cookie：请求头Cookie
userAgent：请求头User-Agent
head：自定义请求头 
     * @return MatchKey 匹配关键字：
protocol：HTTP协议
httpVersion：HTTP版本
method：请求方法
ip：请求源IP
ipAsn：请求源IP自治域号
ipCountry：请求源IP所在国家
ipArea：请求源IP所在大区
xForwardFor：请求头X-Forward-For
directory：路径
index：首页
path：文件全路径
file：文件扩展名
param：请求参数
referer：请求头Referer
cookie：请求头Cookie
userAgent：请求头User-Agent
head：自定义请求头
     */
    public String getMatchKey() {
        return this.MatchKey;
    }

    /**
     * Set 匹配关键字：
protocol：HTTP协议
httpVersion：HTTP版本
method：请求方法
ip：请求源IP
ipAsn：请求源IP自治域号
ipCountry：请求源IP所在国家
ipArea：请求源IP所在大区
xForwardFor：请求头X-Forward-For
directory：路径
index：首页
path：文件全路径
file：文件扩展名
param：请求参数
referer：请求头Referer
cookie：请求头Cookie
userAgent：请求头User-Agent
head：自定义请求头
     * @param MatchKey 匹配关键字：
protocol：HTTP协议
httpVersion：HTTP版本
method：请求方法
ip：请求源IP
ipAsn：请求源IP自治域号
ipCountry：请求源IP所在国家
ipArea：请求源IP所在大区
xForwardFor：请求头X-Forward-For
directory：路径
index：首页
path：文件全路径
file：文件扩展名
param：请求参数
referer：请求头Referer
cookie：请求头Cookie
userAgent：请求头User-Agent
head：自定义请求头
     */
    public void setMatchKey(String MatchKey) {
        this.MatchKey = MatchKey;
    }

    /**
     * Get 逻辑操作符，取值如下：
不包含：exclude
包含：include
不等于：notequal
等于：equal
前缀匹配：matching
内容为空或不存在：null 
     * @return LogicOperator 逻辑操作符，取值如下：
不包含：exclude
包含：include
不等于：notequal
等于：equal
前缀匹配：matching
内容为空或不存在：null
     */
    public String getLogicOperator() {
        return this.LogicOperator;
    }

    /**
     * Set 逻辑操作符，取值如下：
不包含：exclude
包含：include
不等于：notequal
等于：equal
前缀匹配：matching
内容为空或不存在：null
     * @param LogicOperator 逻辑操作符，取值如下：
不包含：exclude
包含：include
不等于：notequal
等于：equal
前缀匹配：matching
内容为空或不存在：null
     */
    public void setLogicOperator(String LogicOperator) {
        this.LogicOperator = LogicOperator;
    }

    /**
     * Get 匹配值。
当MatchKey为protocol时
取值：HTTP、HTTPS

当MatchKey为httpVersion时
取值：HTTP/1.0、HTTP/1.1、HTTP/1.2、HTTP/2、HTTP/3

当MatchKey为method时
取值：HEAD、GET、POST、PUT、OPTIONS、TRACE、DELETE、PATCH、CONNECT

当MatchKey为ipCountry时，取值为：
其他：OTHER
委内瑞拉：VE
乌拉圭：UY
苏里南：SR
巴拉圭：PY
秘鲁：PE
圭亚那：GY
厄瓜多尔：EC
哥伦比亚：CO
智利：CL
巴西：BR
玻利维亚：BO
阿根廷：AR
新西兰：NZ
萨摩亚：WS
瓦努阿图：VU
图瓦卢：TV
汤加：TO
托克劳：TK
帕劳：PW
纽埃：NU
瑙鲁：NR
基里巴斯：KI
关岛：GU
密克罗尼西亚：FM
澳大利亚：AU
美国：US
波多黎各：PR
多米尼加共和国：DO
哥斯达黎加：CR
东萨摩亚：AS
安提瓜和巴布达：AG
巴拿马：PA
尼加拉瓜：NI
墨西哥：MX
牙买加：JM
海地：HT
洪都拉斯：HN
危地马拉：GT
瓜德罗普岛：GP
格陵兰：GL
格林纳达：GD
古巴：CU
加拿大：CA
伯利兹：BZ
巴哈马：BS
百慕大：BM
巴巴多斯：BB
阿鲁巴：AW
安圭拉：AI
梵蒂冈：VA
斯洛伐克：SK
俄罗斯：RU
英国：GB
捷克共和国：CZ
乌克兰：UA
土耳其：TR
斯洛文尼亚：SI
瑞典：SE
塞尔维亚：RS
罗马尼亚：RO
葡萄牙：PT
波兰：PL
挪威：NO
荷兰：NL
马耳他：MT
马其顿：MK
黑山：ME
摩尔多瓦：MD
摩纳哥：MC
拉脱维亚：LV
卢森堡：LU
立陶宛：LT
列支敦士登：LI
哈萨克斯坦：KZ
意大利：IT
冰岛：IS
爱尔兰：IE
匈牙利：HU
克罗地亚：HR
希腊：GR
直布罗陀：GI
根西岛：GG
格鲁吉亚：GE
法国：FR
芬兰：FI
西班牙：ES
爱沙尼亚：EE
丹麦：DK
德国：DE
塞浦路斯：CY
瑞士：CH
白俄罗斯：BY
保加利亚：BG
比利时：BE
阿塞拜疆：AZ
奥地利：AT
亚美尼亚：AM
阿尔巴尼亚：AL
安道尔：AD
东帝汶：TL
叙利亚：SY
沙特阿拉伯：SA
巴勒斯坦：PS
斯里兰卡：LK
斯里兰卡：LK
朝鲜：KP
吉尔吉斯斯坦：KG
中国香港：HK
文莱：BN
孟加拉：BD
阿联酋：AE
也门：YE
越南：VN
乌兹别克斯坦：UZ
中国台湾：TW
土库曼斯坦：TM
塔吉克斯坦：TJ
泰国：TH
新加坡：SG
卡塔尔：QA
巴基斯坦：PK
菲律宾：PH
阿曼：OM
尼泊尔：NP
马来西亚：MY
马尔代夫：MV
中国澳门：MO
蒙古：MN
缅甸：MM
黎巴嫩：LB
科威特：KW
韩国：KR
柬埔寨：KH
日本：JP
约旦：JO
伊朗：IR
伊拉克：IQ
印度：IN
以色列：IL
印度尼西亚：ID
中国：CN
不丹：BT
巴林：BH
阿富汗：AF
利比亚：LY
刚果金：CG
留尼汪岛：RE
斯威士兰：SZ
津巴布韦：ZW
赞比亚：ZM
马约特：YT
乌干达：UG
坦桑尼亚：TZ
突尼斯：TN
多哥：TG
乍得：TD
索马里：SO
塞内加尔：SN
苏丹：SD
塞舌尔：SC
卢旺达：RW
尼日利亚：NG
尼日尔：NE
纳米比亚：NA
莫桑比克：MZ
马拉维：MW
毛里求斯：MU
毛里塔尼亚：MR
马里：ML
马达加斯加：MG
摩洛哥：MA
莱索托：LS
利比里亚：LR
科摩罗：KM
肯尼亚：KE
几内亚：GN
冈比亚：GM
加纳：GH
加蓬：GA
埃塞俄比亚：ET
厄立特里亚：ER
埃及：EG
阿尔及利亚：DZ
吉布提：DJ
喀麦隆：CM
刚果：CG
博茨瓦纳：BW
贝宁：BJ
布隆迪：BI
安哥拉：AO

当MatchKey为ipArea时，取值为：
其他：OTHER
亚洲：AS
欧洲：EU
南极洲：AN
非洲：AF
大洋洲：OC
北美洲：NA
南美洲：SA

当MatchKey为index时
取值为：/;/index.html 
     * @return MatchValue 匹配值。
当MatchKey为protocol时
取值：HTTP、HTTPS

当MatchKey为httpVersion时
取值：HTTP/1.0、HTTP/1.1、HTTP/1.2、HTTP/2、HTTP/3

当MatchKey为method时
取值：HEAD、GET、POST、PUT、OPTIONS、TRACE、DELETE、PATCH、CONNECT

当MatchKey为ipCountry时，取值为：
其他：OTHER
委内瑞拉：VE
乌拉圭：UY
苏里南：SR
巴拉圭：PY
秘鲁：PE
圭亚那：GY
厄瓜多尔：EC
哥伦比亚：CO
智利：CL
巴西：BR
玻利维亚：BO
阿根廷：AR
新西兰：NZ
萨摩亚：WS
瓦努阿图：VU
图瓦卢：TV
汤加：TO
托克劳：TK
帕劳：PW
纽埃：NU
瑙鲁：NR
基里巴斯：KI
关岛：GU
密克罗尼西亚：FM
澳大利亚：AU
美国：US
波多黎各：PR
多米尼加共和国：DO
哥斯达黎加：CR
东萨摩亚：AS
安提瓜和巴布达：AG
巴拿马：PA
尼加拉瓜：NI
墨西哥：MX
牙买加：JM
海地：HT
洪都拉斯：HN
危地马拉：GT
瓜德罗普岛：GP
格陵兰：GL
格林纳达：GD
古巴：CU
加拿大：CA
伯利兹：BZ
巴哈马：BS
百慕大：BM
巴巴多斯：BB
阿鲁巴：AW
安圭拉：AI
梵蒂冈：VA
斯洛伐克：SK
俄罗斯：RU
英国：GB
捷克共和国：CZ
乌克兰：UA
土耳其：TR
斯洛文尼亚：SI
瑞典：SE
塞尔维亚：RS
罗马尼亚：RO
葡萄牙：PT
波兰：PL
挪威：NO
荷兰：NL
马耳他：MT
马其顿：MK
黑山：ME
摩尔多瓦：MD
摩纳哥：MC
拉脱维亚：LV
卢森堡：LU
立陶宛：LT
列支敦士登：LI
哈萨克斯坦：KZ
意大利：IT
冰岛：IS
爱尔兰：IE
匈牙利：HU
克罗地亚：HR
希腊：GR
直布罗陀：GI
根西岛：GG
格鲁吉亚：GE
法国：FR
芬兰：FI
西班牙：ES
爱沙尼亚：EE
丹麦：DK
德国：DE
塞浦路斯：CY
瑞士：CH
白俄罗斯：BY
保加利亚：BG
比利时：BE
阿塞拜疆：AZ
奥地利：AT
亚美尼亚：AM
阿尔巴尼亚：AL
安道尔：AD
东帝汶：TL
叙利亚：SY
沙特阿拉伯：SA
巴勒斯坦：PS
斯里兰卡：LK
斯里兰卡：LK
朝鲜：KP
吉尔吉斯斯坦：KG
中国香港：HK
文莱：BN
孟加拉：BD
阿联酋：AE
也门：YE
越南：VN
乌兹别克斯坦：UZ
中国台湾：TW
土库曼斯坦：TM
塔吉克斯坦：TJ
泰国：TH
新加坡：SG
卡塔尔：QA
巴基斯坦：PK
菲律宾：PH
阿曼：OM
尼泊尔：NP
马来西亚：MY
马尔代夫：MV
中国澳门：MO
蒙古：MN
缅甸：MM
黎巴嫩：LB
科威特：KW
韩国：KR
柬埔寨：KH
日本：JP
约旦：JO
伊朗：IR
伊拉克：IQ
印度：IN
以色列：IL
印度尼西亚：ID
中国：CN
不丹：BT
巴林：BH
阿富汗：AF
利比亚：LY
刚果金：CG
留尼汪岛：RE
斯威士兰：SZ
津巴布韦：ZW
赞比亚：ZM
马约特：YT
乌干达：UG
坦桑尼亚：TZ
突尼斯：TN
多哥：TG
乍得：TD
索马里：SO
塞内加尔：SN
苏丹：SD
塞舌尔：SC
卢旺达：RW
尼日利亚：NG
尼日尔：NE
纳米比亚：NA
莫桑比克：MZ
马拉维：MW
毛里求斯：MU
毛里塔尼亚：MR
马里：ML
马达加斯加：MG
摩洛哥：MA
莱索托：LS
利比里亚：LR
科摩罗：KM
肯尼亚：KE
几内亚：GN
冈比亚：GM
加纳：GH
加蓬：GA
埃塞俄比亚：ET
厄立特里亚：ER
埃及：EG
阿尔及利亚：DZ
吉布提：DJ
喀麦隆：CM
刚果：CG
博茨瓦纳：BW
贝宁：BJ
布隆迪：BI
安哥拉：AO

当MatchKey为ipArea时，取值为：
其他：OTHER
亚洲：AS
欧洲：EU
南极洲：AN
非洲：AF
大洋洲：OC
北美洲：NA
南美洲：SA

当MatchKey为index时
取值为：/;/index.html
     */
    public String [] getMatchValue() {
        return this.MatchValue;
    }

    /**
     * Set 匹配值。
当MatchKey为protocol时
取值：HTTP、HTTPS

当MatchKey为httpVersion时
取值：HTTP/1.0、HTTP/1.1、HTTP/1.2、HTTP/2、HTTP/3

当MatchKey为method时
取值：HEAD、GET、POST、PUT、OPTIONS、TRACE、DELETE、PATCH、CONNECT

当MatchKey为ipCountry时，取值为：
其他：OTHER
委内瑞拉：VE
乌拉圭：UY
苏里南：SR
巴拉圭：PY
秘鲁：PE
圭亚那：GY
厄瓜多尔：EC
哥伦比亚：CO
智利：CL
巴西：BR
玻利维亚：BO
阿根廷：AR
新西兰：NZ
萨摩亚：WS
瓦努阿图：VU
图瓦卢：TV
汤加：TO
托克劳：TK
帕劳：PW
纽埃：NU
瑙鲁：NR
基里巴斯：KI
关岛：GU
密克罗尼西亚：FM
澳大利亚：AU
美国：US
波多黎各：PR
多米尼加共和国：DO
哥斯达黎加：CR
东萨摩亚：AS
安提瓜和巴布达：AG
巴拿马：PA
尼加拉瓜：NI
墨西哥：MX
牙买加：JM
海地：HT
洪都拉斯：HN
危地马拉：GT
瓜德罗普岛：GP
格陵兰：GL
格林纳达：GD
古巴：CU
加拿大：CA
伯利兹：BZ
巴哈马：BS
百慕大：BM
巴巴多斯：BB
阿鲁巴：AW
安圭拉：AI
梵蒂冈：VA
斯洛伐克：SK
俄罗斯：RU
英国：GB
捷克共和国：CZ
乌克兰：UA
土耳其：TR
斯洛文尼亚：SI
瑞典：SE
塞尔维亚：RS
罗马尼亚：RO
葡萄牙：PT
波兰：PL
挪威：NO
荷兰：NL
马耳他：MT
马其顿：MK
黑山：ME
摩尔多瓦：MD
摩纳哥：MC
拉脱维亚：LV
卢森堡：LU
立陶宛：LT
列支敦士登：LI
哈萨克斯坦：KZ
意大利：IT
冰岛：IS
爱尔兰：IE
匈牙利：HU
克罗地亚：HR
希腊：GR
直布罗陀：GI
根西岛：GG
格鲁吉亚：GE
法国：FR
芬兰：FI
西班牙：ES
爱沙尼亚：EE
丹麦：DK
德国：DE
塞浦路斯：CY
瑞士：CH
白俄罗斯：BY
保加利亚：BG
比利时：BE
阿塞拜疆：AZ
奥地利：AT
亚美尼亚：AM
阿尔巴尼亚：AL
安道尔：AD
东帝汶：TL
叙利亚：SY
沙特阿拉伯：SA
巴勒斯坦：PS
斯里兰卡：LK
斯里兰卡：LK
朝鲜：KP
吉尔吉斯斯坦：KG
中国香港：HK
文莱：BN
孟加拉：BD
阿联酋：AE
也门：YE
越南：VN
乌兹别克斯坦：UZ
中国台湾：TW
土库曼斯坦：TM
塔吉克斯坦：TJ
泰国：TH
新加坡：SG
卡塔尔：QA
巴基斯坦：PK
菲律宾：PH
阿曼：OM
尼泊尔：NP
马来西亚：MY
马尔代夫：MV
中国澳门：MO
蒙古：MN
缅甸：MM
黎巴嫩：LB
科威特：KW
韩国：KR
柬埔寨：KH
日本：JP
约旦：JO
伊朗：IR
伊拉克：IQ
印度：IN
以色列：IL
印度尼西亚：ID
中国：CN
不丹：BT
巴林：BH
阿富汗：AF
利比亚：LY
刚果金：CG
留尼汪岛：RE
斯威士兰：SZ
津巴布韦：ZW
赞比亚：ZM
马约特：YT
乌干达：UG
坦桑尼亚：TZ
突尼斯：TN
多哥：TG
乍得：TD
索马里：SO
塞内加尔：SN
苏丹：SD
塞舌尔：SC
卢旺达：RW
尼日利亚：NG
尼日尔：NE
纳米比亚：NA
莫桑比克：MZ
马拉维：MW
毛里求斯：MU
毛里塔尼亚：MR
马里：ML
马达加斯加：MG
摩洛哥：MA
莱索托：LS
利比里亚：LR
科摩罗：KM
肯尼亚：KE
几内亚：GN
冈比亚：GM
加纳：GH
加蓬：GA
埃塞俄比亚：ET
厄立特里亚：ER
埃及：EG
阿尔及利亚：DZ
吉布提：DJ
喀麦隆：CM
刚果：CG
博茨瓦纳：BW
贝宁：BJ
布隆迪：BI
安哥拉：AO

当MatchKey为ipArea时，取值为：
其他：OTHER
亚洲：AS
欧洲：EU
南极洲：AN
非洲：AF
大洋洲：OC
北美洲：NA
南美洲：SA

当MatchKey为index时
取值为：/;/index.html
     * @param MatchValue 匹配值。
当MatchKey为protocol时
取值：HTTP、HTTPS

当MatchKey为httpVersion时
取值：HTTP/1.0、HTTP/1.1、HTTP/1.2、HTTP/2、HTTP/3

当MatchKey为method时
取值：HEAD、GET、POST、PUT、OPTIONS、TRACE、DELETE、PATCH、CONNECT

当MatchKey为ipCountry时，取值为：
其他：OTHER
委内瑞拉：VE
乌拉圭：UY
苏里南：SR
巴拉圭：PY
秘鲁：PE
圭亚那：GY
厄瓜多尔：EC
哥伦比亚：CO
智利：CL
巴西：BR
玻利维亚：BO
阿根廷：AR
新西兰：NZ
萨摩亚：WS
瓦努阿图：VU
图瓦卢：TV
汤加：TO
托克劳：TK
帕劳：PW
纽埃：NU
瑙鲁：NR
基里巴斯：KI
关岛：GU
密克罗尼西亚：FM
澳大利亚：AU
美国：US
波多黎各：PR
多米尼加共和国：DO
哥斯达黎加：CR
东萨摩亚：AS
安提瓜和巴布达：AG
巴拿马：PA
尼加拉瓜：NI
墨西哥：MX
牙买加：JM
海地：HT
洪都拉斯：HN
危地马拉：GT
瓜德罗普岛：GP
格陵兰：GL
格林纳达：GD
古巴：CU
加拿大：CA
伯利兹：BZ
巴哈马：BS
百慕大：BM
巴巴多斯：BB
阿鲁巴：AW
安圭拉：AI
梵蒂冈：VA
斯洛伐克：SK
俄罗斯：RU
英国：GB
捷克共和国：CZ
乌克兰：UA
土耳其：TR
斯洛文尼亚：SI
瑞典：SE
塞尔维亚：RS
罗马尼亚：RO
葡萄牙：PT
波兰：PL
挪威：NO
荷兰：NL
马耳他：MT
马其顿：MK
黑山：ME
摩尔多瓦：MD
摩纳哥：MC
拉脱维亚：LV
卢森堡：LU
立陶宛：LT
列支敦士登：LI
哈萨克斯坦：KZ
意大利：IT
冰岛：IS
爱尔兰：IE
匈牙利：HU
克罗地亚：HR
希腊：GR
直布罗陀：GI
根西岛：GG
格鲁吉亚：GE
法国：FR
芬兰：FI
西班牙：ES
爱沙尼亚：EE
丹麦：DK
德国：DE
塞浦路斯：CY
瑞士：CH
白俄罗斯：BY
保加利亚：BG
比利时：BE
阿塞拜疆：AZ
奥地利：AT
亚美尼亚：AM
阿尔巴尼亚：AL
安道尔：AD
东帝汶：TL
叙利亚：SY
沙特阿拉伯：SA
巴勒斯坦：PS
斯里兰卡：LK
斯里兰卡：LK
朝鲜：KP
吉尔吉斯斯坦：KG
中国香港：HK
文莱：BN
孟加拉：BD
阿联酋：AE
也门：YE
越南：VN
乌兹别克斯坦：UZ
中国台湾：TW
土库曼斯坦：TM
塔吉克斯坦：TJ
泰国：TH
新加坡：SG
卡塔尔：QA
巴基斯坦：PK
菲律宾：PH
阿曼：OM
尼泊尔：NP
马来西亚：MY
马尔代夫：MV
中国澳门：MO
蒙古：MN
缅甸：MM
黎巴嫩：LB
科威特：KW
韩国：KR
柬埔寨：KH
日本：JP
约旦：JO
伊朗：IR
伊拉克：IQ
印度：IN
以色列：IL
印度尼西亚：ID
中国：CN
不丹：BT
巴林：BH
阿富汗：AF
利比亚：LY
刚果金：CG
留尼汪岛：RE
斯威士兰：SZ
津巴布韦：ZW
赞比亚：ZM
马约特：YT
乌干达：UG
坦桑尼亚：TZ
突尼斯：TN
多哥：TG
乍得：TD
索马里：SO
塞内加尔：SN
苏丹：SD
塞舌尔：SC
卢旺达：RW
尼日利亚：NG
尼日尔：NE
纳米比亚：NA
莫桑比克：MZ
马拉维：MW
毛里求斯：MU
毛里塔尼亚：MR
马里：ML
马达加斯加：MG
摩洛哥：MA
莱索托：LS
利比里亚：LR
科摩罗：KM
肯尼亚：KE
几内亚：GN
冈比亚：GM
加纳：GH
加蓬：GA
埃塞俄比亚：ET
厄立特里亚：ER
埃及：EG
阿尔及利亚：DZ
吉布提：DJ
喀麦隆：CM
刚果：CG
博茨瓦纳：BW
贝宁：BJ
布隆迪：BI
安哥拉：AO

当MatchKey为ipArea时，取值为：
其他：OTHER
亚洲：AS
欧洲：EU
南极洲：AN
非洲：AF
大洋洲：OC
北美洲：NA
南美洲：SA

当MatchKey为index时
取值为：/;/index.html
     */
    public void setMatchValue(String [] MatchValue) {
        this.MatchValue = MatchValue;
    }

    /**
     * Get 是否区分大小写 true：区分 false：不区分 
     * @return CaseSensitive 是否区分大小写 true：区分 false：不区分
     */
    public Boolean getCaseSensitive() {
        return this.CaseSensitive;
    }

    /**
     * Set 是否区分大小写 true：区分 false：不区分
     * @param CaseSensitive 是否区分大小写 true：区分 false：不区分
     */
    public void setCaseSensitive(Boolean CaseSensitive) {
        this.CaseSensitive = CaseSensitive;
    }

    /**
     * Get 当MatchKey为param时必填：表示请求参数Key 当MatchKey为cookie时必填：表示请求头Cookie中参数的 
     * @return MatchKeyParam 当MatchKey为param时必填：表示请求参数Key 当MatchKey为cookie时必填：表示请求头Cookie中参数的
     */
    public String getMatchKeyParam() {
        return this.MatchKeyParam;
    }

    /**
     * Set 当MatchKey为param时必填：表示请求参数Key 当MatchKey为cookie时必填：表示请求头Cookie中参数的
     * @param MatchKeyParam 当MatchKey为param时必填：表示请求参数Key 当MatchKey为cookie时必填：表示请求头Cookie中参数的
     */
    public void setMatchKeyParam(String MatchKeyParam) {
        this.MatchKeyParam = MatchKeyParam;
    }

    public AdvancedScdnAclRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedScdnAclRule(AdvancedScdnAclRule source) {
        if (source.MatchKey != null) {
            this.MatchKey = new String(source.MatchKey);
        }
        if (source.LogicOperator != null) {
            this.LogicOperator = new String(source.LogicOperator);
        }
        if (source.MatchValue != null) {
            this.MatchValue = new String[source.MatchValue.length];
            for (int i = 0; i < source.MatchValue.length; i++) {
                this.MatchValue[i] = new String(source.MatchValue[i]);
            }
        }
        if (source.CaseSensitive != null) {
            this.CaseSensitive = new Boolean(source.CaseSensitive);
        }
        if (source.MatchKeyParam != null) {
            this.MatchKeyParam = new String(source.MatchKeyParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchKey", this.MatchKey);
        this.setParamSimple(map, prefix + "LogicOperator", this.LogicOperator);
        this.setParamArraySimple(map, prefix + "MatchValue.", this.MatchValue);
        this.setParamSimple(map, prefix + "CaseSensitive", this.CaseSensitive);
        this.setParamSimple(map, prefix + "MatchKeyParam", this.MatchKeyParam);

    }
}

