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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GynaecologyBaseItem extends AbstractModel {

    /**
    * 外阴
    */
    @SerializedName("Vulva")
    @Expose
    private GynaecologyVulva Vulva;

    /**
    * 阴道
    */
    @SerializedName("Vagina")
    @Expose
    private GynaecologyVagina Vagina;

    /**
    * 子宫颈
    */
    @SerializedName("Cervix")
    @Expose
    private GynaecologyCervix Cervix;

    /**
    * 子宫
    */
    @SerializedName("Uterus")
    @Expose
    private GynaecologyUterus Uterus;

    /**
    * 子宫附件
    */
    @SerializedName("Adnexal")
    @Expose
    private GynaecologyAdnexal Adnexal;

    /**
    * 盆腔
    */
    @SerializedName("PelvicCavity")
    @Expose
    private GynaecologyPelvicCavity PelvicCavity;

    /**
    * 妇科其他
    */
    @SerializedName("Others")
    @Expose
    private KeyValueItem [] Others;

    /**
    * 月经史
    */
    @SerializedName("MenstrualHistory")
    @Expose
    private GynaecologyMenstrualHistory MenstrualHistory;

    /**
    * 小结
    */
    @SerializedName("BriefSummary")
    @Expose
    private GynaecologyBriefSummary BriefSummary;

    /**
     * Get 外阴 
     * @return Vulva 外阴
     */
    public GynaecologyVulva getVulva() {
        return this.Vulva;
    }

    /**
     * Set 外阴
     * @param Vulva 外阴
     */
    public void setVulva(GynaecologyVulva Vulva) {
        this.Vulva = Vulva;
    }

    /**
     * Get 阴道 
     * @return Vagina 阴道
     */
    public GynaecologyVagina getVagina() {
        return this.Vagina;
    }

    /**
     * Set 阴道
     * @param Vagina 阴道
     */
    public void setVagina(GynaecologyVagina Vagina) {
        this.Vagina = Vagina;
    }

    /**
     * Get 子宫颈 
     * @return Cervix 子宫颈
     */
    public GynaecologyCervix getCervix() {
        return this.Cervix;
    }

    /**
     * Set 子宫颈
     * @param Cervix 子宫颈
     */
    public void setCervix(GynaecologyCervix Cervix) {
        this.Cervix = Cervix;
    }

    /**
     * Get 子宫 
     * @return Uterus 子宫
     */
    public GynaecologyUterus getUterus() {
        return this.Uterus;
    }

    /**
     * Set 子宫
     * @param Uterus 子宫
     */
    public void setUterus(GynaecologyUterus Uterus) {
        this.Uterus = Uterus;
    }

    /**
     * Get 子宫附件 
     * @return Adnexal 子宫附件
     */
    public GynaecologyAdnexal getAdnexal() {
        return this.Adnexal;
    }

    /**
     * Set 子宫附件
     * @param Adnexal 子宫附件
     */
    public void setAdnexal(GynaecologyAdnexal Adnexal) {
        this.Adnexal = Adnexal;
    }

    /**
     * Get 盆腔 
     * @return PelvicCavity 盆腔
     */
    public GynaecologyPelvicCavity getPelvicCavity() {
        return this.PelvicCavity;
    }

    /**
     * Set 盆腔
     * @param PelvicCavity 盆腔
     */
    public void setPelvicCavity(GynaecologyPelvicCavity PelvicCavity) {
        this.PelvicCavity = PelvicCavity;
    }

    /**
     * Get 妇科其他 
     * @return Others 妇科其他
     */
    public KeyValueItem [] getOthers() {
        return this.Others;
    }

    /**
     * Set 妇科其他
     * @param Others 妇科其他
     */
    public void setOthers(KeyValueItem [] Others) {
        this.Others = Others;
    }

    /**
     * Get 月经史 
     * @return MenstrualHistory 月经史
     */
    public GynaecologyMenstrualHistory getMenstrualHistory() {
        return this.MenstrualHistory;
    }

    /**
     * Set 月经史
     * @param MenstrualHistory 月经史
     */
    public void setMenstrualHistory(GynaecologyMenstrualHistory MenstrualHistory) {
        this.MenstrualHistory = MenstrualHistory;
    }

    /**
     * Get 小结 
     * @return BriefSummary 小结
     */
    public GynaecologyBriefSummary getBriefSummary() {
        return this.BriefSummary;
    }

    /**
     * Set 小结
     * @param BriefSummary 小结
     */
    public void setBriefSummary(GynaecologyBriefSummary BriefSummary) {
        this.BriefSummary = BriefSummary;
    }

    public GynaecologyBaseItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GynaecologyBaseItem(GynaecologyBaseItem source) {
        if (source.Vulva != null) {
            this.Vulva = new GynaecologyVulva(source.Vulva);
        }
        if (source.Vagina != null) {
            this.Vagina = new GynaecologyVagina(source.Vagina);
        }
        if (source.Cervix != null) {
            this.Cervix = new GynaecologyCervix(source.Cervix);
        }
        if (source.Uterus != null) {
            this.Uterus = new GynaecologyUterus(source.Uterus);
        }
        if (source.Adnexal != null) {
            this.Adnexal = new GynaecologyAdnexal(source.Adnexal);
        }
        if (source.PelvicCavity != null) {
            this.PelvicCavity = new GynaecologyPelvicCavity(source.PelvicCavity);
        }
        if (source.Others != null) {
            this.Others = new KeyValueItem[source.Others.length];
            for (int i = 0; i < source.Others.length; i++) {
                this.Others[i] = new KeyValueItem(source.Others[i]);
            }
        }
        if (source.MenstrualHistory != null) {
            this.MenstrualHistory = new GynaecologyMenstrualHistory(source.MenstrualHistory);
        }
        if (source.BriefSummary != null) {
            this.BriefSummary = new GynaecologyBriefSummary(source.BriefSummary);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Vulva.", this.Vulva);
        this.setParamObj(map, prefix + "Vagina.", this.Vagina);
        this.setParamObj(map, prefix + "Cervix.", this.Cervix);
        this.setParamObj(map, prefix + "Uterus.", this.Uterus);
        this.setParamObj(map, prefix + "Adnexal.", this.Adnexal);
        this.setParamObj(map, prefix + "PelvicCavity.", this.PelvicCavity);
        this.setParamArrayObj(map, prefix + "Others.", this.Others);
        this.setParamObj(map, prefix + "MenstrualHistory.", this.MenstrualHistory);
        this.setParamObj(map, prefix + "BriefSummary.", this.BriefSummary);

    }
}

