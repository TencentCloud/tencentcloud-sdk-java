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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InternalMedicineRespiratorySystem extends AbstractModel {

    /**
    * 呼吸系统总体描述
    */
    @SerializedName("Text")
    @Expose
    private KeyValueItem Text;

    /**
    * 胸廓
    */
    @SerializedName("Thoracic")
    @Expose
    private KeyValueItem Thoracic;

    /**
    * 痰量
    */
    @SerializedName("Sputum")
    @Expose
    private KeyValueItem Sputum;

    /**
    * 肺部叩诊
    */
    @SerializedName("LungPercussion")
    @Expose
    private KeyValueItem LungPercussion;

    /**
    * 肺部听诊其他
    */
    @SerializedName("LungAuscultation")
    @Expose
    private KeyValueItem [] LungAuscultation;

    /**
     * Get 呼吸系统总体描述 
     * @return Text 呼吸系统总体描述
     */
    public KeyValueItem getText() {
        return this.Text;
    }

    /**
     * Set 呼吸系统总体描述
     * @param Text 呼吸系统总体描述
     */
    public void setText(KeyValueItem Text) {
        this.Text = Text;
    }

    /**
     * Get 胸廓 
     * @return Thoracic 胸廓
     */
    public KeyValueItem getThoracic() {
        return this.Thoracic;
    }

    /**
     * Set 胸廓
     * @param Thoracic 胸廓
     */
    public void setThoracic(KeyValueItem Thoracic) {
        this.Thoracic = Thoracic;
    }

    /**
     * Get 痰量 
     * @return Sputum 痰量
     */
    public KeyValueItem getSputum() {
        return this.Sputum;
    }

    /**
     * Set 痰量
     * @param Sputum 痰量
     */
    public void setSputum(KeyValueItem Sputum) {
        this.Sputum = Sputum;
    }

    /**
     * Get 肺部叩诊 
     * @return LungPercussion 肺部叩诊
     */
    public KeyValueItem getLungPercussion() {
        return this.LungPercussion;
    }

    /**
     * Set 肺部叩诊
     * @param LungPercussion 肺部叩诊
     */
    public void setLungPercussion(KeyValueItem LungPercussion) {
        this.LungPercussion = LungPercussion;
    }

    /**
     * Get 肺部听诊其他 
     * @return LungAuscultation 肺部听诊其他
     */
    public KeyValueItem [] getLungAuscultation() {
        return this.LungAuscultation;
    }

    /**
     * Set 肺部听诊其他
     * @param LungAuscultation 肺部听诊其他
     */
    public void setLungAuscultation(KeyValueItem [] LungAuscultation) {
        this.LungAuscultation = LungAuscultation;
    }

    public InternalMedicineRespiratorySystem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InternalMedicineRespiratorySystem(InternalMedicineRespiratorySystem source) {
        if (source.Text != null) {
            this.Text = new KeyValueItem(source.Text);
        }
        if (source.Thoracic != null) {
            this.Thoracic = new KeyValueItem(source.Thoracic);
        }
        if (source.Sputum != null) {
            this.Sputum = new KeyValueItem(source.Sputum);
        }
        if (source.LungPercussion != null) {
            this.LungPercussion = new KeyValueItem(source.LungPercussion);
        }
        if (source.LungAuscultation != null) {
            this.LungAuscultation = new KeyValueItem[source.LungAuscultation.length];
            for (int i = 0; i < source.LungAuscultation.length; i++) {
                this.LungAuscultation[i] = new KeyValueItem(source.LungAuscultation[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Text.", this.Text);
        this.setParamObj(map, prefix + "Thoracic.", this.Thoracic);
        this.setParamObj(map, prefix + "Sputum.", this.Sputum);
        this.setParamObj(map, prefix + "LungPercussion.", this.LungPercussion);
        this.setParamArrayObj(map, prefix + "LungAuscultation.", this.LungAuscultation);

    }
}

