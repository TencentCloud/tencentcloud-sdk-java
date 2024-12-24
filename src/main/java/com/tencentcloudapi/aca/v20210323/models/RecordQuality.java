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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordQuality extends AbstractModel {

    /**
    * 病历是否有问题
    */
    @SerializedName("Hit")
    @Expose
    private Boolean Hit;

    /**
    * 完整性问题
    */
    @SerializedName("Completeness")
    @Expose
    private String Completeness;

    /**
    * 及时性问题
    */
    @SerializedName("Timeliness")
    @Expose
    private String Timeliness;

    /**
    * 逻辑性问题
    */
    @SerializedName("Logical")
    @Expose
    private String Logical;

    /**
     * Get 病历是否有问题 
     * @return Hit 病历是否有问题
     */
    public Boolean getHit() {
        return this.Hit;
    }

    /**
     * Set 病历是否有问题
     * @param Hit 病历是否有问题
     */
    public void setHit(Boolean Hit) {
        this.Hit = Hit;
    }

    /**
     * Get 完整性问题 
     * @return Completeness 完整性问题
     */
    public String getCompleteness() {
        return this.Completeness;
    }

    /**
     * Set 完整性问题
     * @param Completeness 完整性问题
     */
    public void setCompleteness(String Completeness) {
        this.Completeness = Completeness;
    }

    /**
     * Get 及时性问题 
     * @return Timeliness 及时性问题
     */
    public String getTimeliness() {
        return this.Timeliness;
    }

    /**
     * Set 及时性问题
     * @param Timeliness 及时性问题
     */
    public void setTimeliness(String Timeliness) {
        this.Timeliness = Timeliness;
    }

    /**
     * Get 逻辑性问题 
     * @return Logical 逻辑性问题
     */
    public String getLogical() {
        return this.Logical;
    }

    /**
     * Set 逻辑性问题
     * @param Logical 逻辑性问题
     */
    public void setLogical(String Logical) {
        this.Logical = Logical;
    }

    public RecordQuality() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordQuality(RecordQuality source) {
        if (source.Hit != null) {
            this.Hit = new Boolean(source.Hit);
        }
        if (source.Completeness != null) {
            this.Completeness = new String(source.Completeness);
        }
        if (source.Timeliness != null) {
            this.Timeliness = new String(source.Timeliness);
        }
        if (source.Logical != null) {
            this.Logical = new String(source.Logical);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Hit", this.Hit);
        this.setParamSimple(map, prefix + "Completeness", this.Completeness);
        this.setParamSimple(map, prefix + "Timeliness", this.Timeliness);
        this.setParamSimple(map, prefix + "Logical", this.Logical);

    }
}

