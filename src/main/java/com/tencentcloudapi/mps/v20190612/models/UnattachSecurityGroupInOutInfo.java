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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnattachSecurityGroupInOutInfo extends AbstractModel {

    /**
    * 该安全组关联的FlowId。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 要解绑的输入/输出ID。
    */
    @SerializedName("InOutId")
    @Expose
    private String InOutId;

    /**
    * 输入/输出类型，可选值：
Input：输入
Output：输出。
    */
    @SerializedName("InOutType")
    @Expose
    private String InOutType;

    /**
    * Flow所在的Region，和input共用。
    */
    @SerializedName("FlowRegion")
    @Expose
    private String FlowRegion;

    /**
     * Get 该安全组关联的FlowId。 
     * @return FlowId 该安全组关联的FlowId。
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 该安全组关联的FlowId。
     * @param FlowId 该安全组关联的FlowId。
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 要解绑的输入/输出ID。 
     * @return InOutId 要解绑的输入/输出ID。
     */
    public String getInOutId() {
        return this.InOutId;
    }

    /**
     * Set 要解绑的输入/输出ID。
     * @param InOutId 要解绑的输入/输出ID。
     */
    public void setInOutId(String InOutId) {
        this.InOutId = InOutId;
    }

    /**
     * Get 输入/输出类型，可选值：
Input：输入
Output：输出。 
     * @return InOutType 输入/输出类型，可选值：
Input：输入
Output：输出。
     */
    public String getInOutType() {
        return this.InOutType;
    }

    /**
     * Set 输入/输出类型，可选值：
Input：输入
Output：输出。
     * @param InOutType 输入/输出类型，可选值：
Input：输入
Output：输出。
     */
    public void setInOutType(String InOutType) {
        this.InOutType = InOutType;
    }

    /**
     * Get Flow所在的Region，和input共用。 
     * @return FlowRegion Flow所在的Region，和input共用。
     */
    public String getFlowRegion() {
        return this.FlowRegion;
    }

    /**
     * Set Flow所在的Region，和input共用。
     * @param FlowRegion Flow所在的Region，和input共用。
     */
    public void setFlowRegion(String FlowRegion) {
        this.FlowRegion = FlowRegion;
    }

    public UnattachSecurityGroupInOutInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnattachSecurityGroupInOutInfo(UnattachSecurityGroupInOutInfo source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.InOutId != null) {
            this.InOutId = new String(source.InOutId);
        }
        if (source.InOutType != null) {
            this.InOutType = new String(source.InOutType);
        }
        if (source.FlowRegion != null) {
            this.FlowRegion = new String(source.FlowRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "InOutId", this.InOutId);
        this.setParamSimple(map, prefix + "InOutType", this.InOutType);
        this.setParamSimple(map, prefix + "FlowRegion", this.FlowRegion);

    }
}

