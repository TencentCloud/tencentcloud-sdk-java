/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeoBlockStrategy extends AbstractModel {

    /**
    * 规则类型
whitelist: 白名单
blacklist: 黑名单
    */
    @SerializedName("BlockType")
    @Expose
    private String BlockType;

    /**
    * 生效规则
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
    * 生效类型
all: 全部
directory: 目录
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 生效区域，可选值有: CN-AH CN-BJ CN-CQ CN-FJ CN-GD CN-GS CN-GX CN-GZ CN-HA CN-HB CN-HE CN-HI CN-HK CN-HL CN-HN CN-JL CN-JS CN-JX CN-LN CN-MO CN-NM CN-NX CN-QH CN-SC CN-SD CN-SH CN-SN CN-SX CN-TJ CN-TW CN-XJ CN-XZ CN-YN CN-ZJ AF AX AL DZ AS AD AO AI AQ AG AR AM AW AU AT AZ BS BH BD BB BY BE BZ BJ BM BT BO BQ BA BW BV BR IO BN BG BF BI CV KH CM CA KY CF TD CL CN CX CC CO KM CG CD CK CR CI HR CU CW CY CZ DK DJ DM DO EC EG SV GQ ER EE SZ ET FK FO FJ FI FR GF PF TF GA GM GE DE GH GI GR GL GD GP GU GT GG GN GW GY HT HM VA HN HK HU IS IN ID IR IQ IE IM IL IT JM JP JE JO KZ KE KI KP KR KW KG LA LV LB LS LR LY LI LT LU MO MG MW MY MV ML MT MH MQ MR MU YT MX FM MD MC MN ME MS MA MZ MM NA NR NP NL NC NZ NI NE NG NU NF MK MP NO OM PK PW PS PA PG PY PE PH PN PL PT PR QA RE RO RU RW BL SH KN LC MF PM VC WS SM ST SA SN RS SC SL SG SX SK SI SB SO ZA GS SS ES LK SD SR SJ SE CH SY TW TJ TZ TH TL TG TK TO TT TN TR TM TC TV UG UA AE GB US UM UY UZ VU VE VN VG VI WF EH YE ZM ZW
    */
    @SerializedName("Districts")
    @Expose
    private String [] Districts;

    /**
     * Get 规则类型
whitelist: 白名单
blacklist: 黑名单 
     * @return BlockType 规则类型
whitelist: 白名单
blacklist: 黑名单
     */
    public String getBlockType() {
        return this.BlockType;
    }

    /**
     * Set 规则类型
whitelist: 白名单
blacklist: 黑名单
     * @param BlockType 规则类型
whitelist: 白名单
blacklist: 黑名单
     */
    public void setBlockType(String BlockType) {
        this.BlockType = BlockType;
    }

    /**
     * Get 生效规则 
     * @return RulePaths 生效规则
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set 生效规则
     * @param RulePaths 生效规则
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    /**
     * Get 生效类型
all: 全部
directory: 目录 
     * @return RuleType 生效类型
all: 全部
directory: 目录
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 生效类型
all: 全部
directory: 目录
     * @param RuleType 生效类型
all: 全部
directory: 目录
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 生效区域，可选值有: CN-AH CN-BJ CN-CQ CN-FJ CN-GD CN-GS CN-GX CN-GZ CN-HA CN-HB CN-HE CN-HI CN-HK CN-HL CN-HN CN-JL CN-JS CN-JX CN-LN CN-MO CN-NM CN-NX CN-QH CN-SC CN-SD CN-SH CN-SN CN-SX CN-TJ CN-TW CN-XJ CN-XZ CN-YN CN-ZJ AF AX AL DZ AS AD AO AI AQ AG AR AM AW AU AT AZ BS BH BD BB BY BE BZ BJ BM BT BO BQ BA BW BV BR IO BN BG BF BI CV KH CM CA KY CF TD CL CN CX CC CO KM CG CD CK CR CI HR CU CW CY CZ DK DJ DM DO EC EG SV GQ ER EE SZ ET FK FO FJ FI FR GF PF TF GA GM GE DE GH GI GR GL GD GP GU GT GG GN GW GY HT HM VA HN HK HU IS IN ID IR IQ IE IM IL IT JM JP JE JO KZ KE KI KP KR KW KG LA LV LB LS LR LY LI LT LU MO MG MW MY MV ML MT MH MQ MR MU YT MX FM MD MC MN ME MS MA MZ MM NA NR NP NL NC NZ NI NE NG NU NF MK MP NO OM PK PW PS PA PG PY PE PH PN PL PT PR QA RE RO RU RW BL SH KN LC MF PM VC WS SM ST SA SN RS SC SL SG SX SK SI SB SO ZA GS SS ES LK SD SR SJ SE CH SY TW TJ TZ TH TL TG TK TO TT TN TR TM TC TV UG UA AE GB US UM UY UZ VU VE VN VG VI WF EH YE ZM ZW 
     * @return Districts 生效区域，可选值有: CN-AH CN-BJ CN-CQ CN-FJ CN-GD CN-GS CN-GX CN-GZ CN-HA CN-HB CN-HE CN-HI CN-HK CN-HL CN-HN CN-JL CN-JS CN-JX CN-LN CN-MO CN-NM CN-NX CN-QH CN-SC CN-SD CN-SH CN-SN CN-SX CN-TJ CN-TW CN-XJ CN-XZ CN-YN CN-ZJ AF AX AL DZ AS AD AO AI AQ AG AR AM AW AU AT AZ BS BH BD BB BY BE BZ BJ BM BT BO BQ BA BW BV BR IO BN BG BF BI CV KH CM CA KY CF TD CL CN CX CC CO KM CG CD CK CR CI HR CU CW CY CZ DK DJ DM DO EC EG SV GQ ER EE SZ ET FK FO FJ FI FR GF PF TF GA GM GE DE GH GI GR GL GD GP GU GT GG GN GW GY HT HM VA HN HK HU IS IN ID IR IQ IE IM IL IT JM JP JE JO KZ KE KI KP KR KW KG LA LV LB LS LR LY LI LT LU MO MG MW MY MV ML MT MH MQ MR MU YT MX FM MD MC MN ME MS MA MZ MM NA NR NP NL NC NZ NI NE NG NU NF MK MP NO OM PK PW PS PA PG PY PE PH PN PL PT PR QA RE RO RU RW BL SH KN LC MF PM VC WS SM ST SA SN RS SC SL SG SX SK SI SB SO ZA GS SS ES LK SD SR SJ SE CH SY TW TJ TZ TH TL TG TK TO TT TN TR TM TC TV UG UA AE GB US UM UY UZ VU VE VN VG VI WF EH YE ZM ZW
     */
    public String [] getDistricts() {
        return this.Districts;
    }

    /**
     * Set 生效区域，可选值有: CN-AH CN-BJ CN-CQ CN-FJ CN-GD CN-GS CN-GX CN-GZ CN-HA CN-HB CN-HE CN-HI CN-HK CN-HL CN-HN CN-JL CN-JS CN-JX CN-LN CN-MO CN-NM CN-NX CN-QH CN-SC CN-SD CN-SH CN-SN CN-SX CN-TJ CN-TW CN-XJ CN-XZ CN-YN CN-ZJ AF AX AL DZ AS AD AO AI AQ AG AR AM AW AU AT AZ BS BH BD BB BY BE BZ BJ BM BT BO BQ BA BW BV BR IO BN BG BF BI CV KH CM CA KY CF TD CL CN CX CC CO KM CG CD CK CR CI HR CU CW CY CZ DK DJ DM DO EC EG SV GQ ER EE SZ ET FK FO FJ FI FR GF PF TF GA GM GE DE GH GI GR GL GD GP GU GT GG GN GW GY HT HM VA HN HK HU IS IN ID IR IQ IE IM IL IT JM JP JE JO KZ KE KI KP KR KW KG LA LV LB LS LR LY LI LT LU MO MG MW MY MV ML MT MH MQ MR MU YT MX FM MD MC MN ME MS MA MZ MM NA NR NP NL NC NZ NI NE NG NU NF MK MP NO OM PK PW PS PA PG PY PE PH PN PL PT PR QA RE RO RU RW BL SH KN LC MF PM VC WS SM ST SA SN RS SC SL SG SX SK SI SB SO ZA GS SS ES LK SD SR SJ SE CH SY TW TJ TZ TH TL TG TK TO TT TN TR TM TC TV UG UA AE GB US UM UY UZ VU VE VN VG VI WF EH YE ZM ZW
     * @param Districts 生效区域，可选值有: CN-AH CN-BJ CN-CQ CN-FJ CN-GD CN-GS CN-GX CN-GZ CN-HA CN-HB CN-HE CN-HI CN-HK CN-HL CN-HN CN-JL CN-JS CN-JX CN-LN CN-MO CN-NM CN-NX CN-QH CN-SC CN-SD CN-SH CN-SN CN-SX CN-TJ CN-TW CN-XJ CN-XZ CN-YN CN-ZJ AF AX AL DZ AS AD AO AI AQ AG AR AM AW AU AT AZ BS BH BD BB BY BE BZ BJ BM BT BO BQ BA BW BV BR IO BN BG BF BI CV KH CM CA KY CF TD CL CN CX CC CO KM CG CD CK CR CI HR CU CW CY CZ DK DJ DM DO EC EG SV GQ ER EE SZ ET FK FO FJ FI FR GF PF TF GA GM GE DE GH GI GR GL GD GP GU GT GG GN GW GY HT HM VA HN HK HU IS IN ID IR IQ IE IM IL IT JM JP JE JO KZ KE KI KP KR KW KG LA LV LB LS LR LY LI LT LU MO MG MW MY MV ML MT MH MQ MR MU YT MX FM MD MC MN ME MS MA MZ MM NA NR NP NL NC NZ NI NE NG NU NF MK MP NO OM PK PW PS PA PG PY PE PH PN PL PT PR QA RE RO RU RW BL SH KN LC MF PM VC WS SM ST SA SN RS SC SL SG SX SK SI SB SO ZA GS SS ES LK SD SR SJ SE CH SY TW TJ TZ TH TL TG TK TO TT TN TR TM TC TV UG UA AE GB US UM UY UZ VU VE VN VG VI WF EH YE ZM ZW
     */
    public void setDistricts(String [] Districts) {
        this.Districts = Districts;
    }

    public GeoBlockStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeoBlockStrategy(GeoBlockStrategy source) {
        if (source.BlockType != null) {
            this.BlockType = new String(source.BlockType);
        }
        if (source.RulePaths != null) {
            this.RulePaths = new String[source.RulePaths.length];
            for (int i = 0; i < source.RulePaths.length; i++) {
                this.RulePaths[i] = new String(source.RulePaths[i]);
            }
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.Districts != null) {
            this.Districts = new String[source.Districts.length];
            for (int i = 0; i < source.Districts.length; i++) {
                this.Districts[i] = new String(source.Districts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlockType", this.BlockType);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "Districts.", this.Districts);

    }
}

