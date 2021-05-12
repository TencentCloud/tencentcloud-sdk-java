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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SdkAppIdRecordUsage extends AbstractModel{

    /**
    * SdkAppId的值。
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * 统计的时间点数据。
    */
    @SerializedName("Usages")
    @Expose
    private RecordUsage [] Usages;

    /**
     * Get SdkAppId的值。 
     * @return SdkAppId SdkAppId的值。
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set SdkAppId的值。
     * @param SdkAppId SdkAppId的值。
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 统计的时间点数据。 
     * @return Usages 统计的时间点数据。
     */
    public RecordUsage [] getUsages() {
        return this.Usages;
    }

    /**
     * Set 统计的时间点数据。
     * @param Usages 统计的时间点数据。
     */
    public void setUsages(RecordUsage [] Usages) {
        this.Usages = Usages;
    }

    public SdkAppIdRecordUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SdkAppIdRecordUsage(SdkAppIdRecordUsage source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new String(source.SdkAppId);
        }
        if (source.Usages != null) {
            this.Usages = new RecordUsage[source.Usages.length];
            for (int i = 0; i < source.Usages.length; i++) {
                this.Usages[i] = new RecordUsage(source.Usages[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArrayObj(map, prefix + "Usages.", this.Usages);

    }
}

