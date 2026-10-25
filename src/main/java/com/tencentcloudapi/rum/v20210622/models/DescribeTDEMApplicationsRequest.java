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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTDEMApplicationsRequest extends AbstractModel {

    /**
    * <p>分页偏移，默认 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页数量，默认 20，上限 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>业务系统 ID（可选，缺省返回名下全部应用）</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>演示模式开关</p>
    */
    @SerializedName("DemoMode")
    @Expose
    private Boolean DemoMode;

    /**
     * Get <p>分页偏移，默认 0</p> 
     * @return Offset <p>分页偏移，默认 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移，默认 0</p>
     * @param Offset <p>分页偏移，默认 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页数量，默认 20，上限 100</p> 
     * @return Limit <p>每页数量，默认 20，上限 100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页数量，默认 20，上限 100</p>
     * @param Limit <p>每页数量，默认 20，上限 100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>业务系统 ID（可选，缺省返回名下全部应用）</p> 
     * @return InstanceId <p>业务系统 ID（可选，缺省返回名下全部应用）</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>业务系统 ID（可选，缺省返回名下全部应用）</p>
     * @param InstanceId <p>业务系统 ID（可选，缺省返回名下全部应用）</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>演示模式开关</p> 
     * @return DemoMode <p>演示模式开关</p>
     */
    public Boolean getDemoMode() {
        return this.DemoMode;
    }

    /**
     * Set <p>演示模式开关</p>
     * @param DemoMode <p>演示模式开关</p>
     */
    public void setDemoMode(Boolean DemoMode) {
        this.DemoMode = DemoMode;
    }

    public DescribeTDEMApplicationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMApplicationsRequest(DescribeTDEMApplicationsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DemoMode != null) {
            this.DemoMode = new Boolean(source.DemoMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DemoMode", this.DemoMode);

    }
}

