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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceCheckItemsOverview extends AbstractModel {

    /**
    * <p>检查项数量</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>检查项通过率</p>
    */
    @SerializedName("PassRate")
    @Expose
    private Long PassRate;

    /**
    * <p>检查类型和检查项分布</p>
    */
    @SerializedName("CheckTypes")
    @Expose
    private ComplianceCheckTypeItem [] CheckTypes;

    /**
     * Get <p>检查项数量</p> 
     * @return TotalCount <p>检查项数量</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>检查项数量</p>
     * @param TotalCount <p>检查项数量</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>检查项通过率</p> 
     * @return PassRate <p>检查项通过率</p>
     */
    public Long getPassRate() {
        return this.PassRate;
    }

    /**
     * Set <p>检查项通过率</p>
     * @param PassRate <p>检查项通过率</p>
     */
    public void setPassRate(Long PassRate) {
        this.PassRate = PassRate;
    }

    /**
     * Get <p>检查类型和检查项分布</p> 
     * @return CheckTypes <p>检查类型和检查项分布</p>
     */
    public ComplianceCheckTypeItem [] getCheckTypes() {
        return this.CheckTypes;
    }

    /**
     * Set <p>检查类型和检查项分布</p>
     * @param CheckTypes <p>检查类型和检查项分布</p>
     */
    public void setCheckTypes(ComplianceCheckTypeItem [] CheckTypes) {
        this.CheckTypes = CheckTypes;
    }

    public ComplianceCheckItemsOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceCheckItemsOverview(ComplianceCheckItemsOverview source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.PassRate != null) {
            this.PassRate = new Long(source.PassRate);
        }
        if (source.CheckTypes != null) {
            this.CheckTypes = new ComplianceCheckTypeItem[source.CheckTypes.length];
            for (int i = 0; i < source.CheckTypes.length; i++) {
                this.CheckTypes[i] = new ComplianceCheckTypeItem(source.CheckTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "PassRate", this.PassRate);
        this.setParamArrayObj(map, prefix + "CheckTypes.", this.CheckTypes);

    }
}

