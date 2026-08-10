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
package com.tencentcloudapi.cds.v20180420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DsgcBindingInfo extends AbstractModel {

    /**
    * dspa实例id
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * dspa绑定模板/合规组 id ComplianceGroupId
    */
    @SerializedName("DspaCgId")
    @Expose
    private Long DspaCgId;

    /**
    * dspa绑定模板/合规组名称
    */
    @SerializedName("DspaCgName")
    @Expose
    private String DspaCgName;

    /**
    * dspa实例状态 0 正常 1 隔离 2 销毁
    */
    @SerializedName("DspaStatus")
    @Expose
    private Long DspaStatus;

    /**
    * 模板状态 0: 正常   1: 已删除
    */
    @SerializedName("DspaCgStatus")
    @Expose
    private Long DspaCgStatus;

    /**
     * Get dspa实例id 
     * @return DspaId dspa实例id
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set dspa实例id
     * @param DspaId dspa实例id
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get dspa绑定模板/合规组 id ComplianceGroupId 
     * @return DspaCgId dspa绑定模板/合规组 id ComplianceGroupId
     */
    public Long getDspaCgId() {
        return this.DspaCgId;
    }

    /**
     * Set dspa绑定模板/合规组 id ComplianceGroupId
     * @param DspaCgId dspa绑定模板/合规组 id ComplianceGroupId
     */
    public void setDspaCgId(Long DspaCgId) {
        this.DspaCgId = DspaCgId;
    }

    /**
     * Get dspa绑定模板/合规组名称 
     * @return DspaCgName dspa绑定模板/合规组名称
     */
    public String getDspaCgName() {
        return this.DspaCgName;
    }

    /**
     * Set dspa绑定模板/合规组名称
     * @param DspaCgName dspa绑定模板/合规组名称
     */
    public void setDspaCgName(String DspaCgName) {
        this.DspaCgName = DspaCgName;
    }

    /**
     * Get dspa实例状态 0 正常 1 隔离 2 销毁 
     * @return DspaStatus dspa实例状态 0 正常 1 隔离 2 销毁
     */
    public Long getDspaStatus() {
        return this.DspaStatus;
    }

    /**
     * Set dspa实例状态 0 正常 1 隔离 2 销毁
     * @param DspaStatus dspa实例状态 0 正常 1 隔离 2 销毁
     */
    public void setDspaStatus(Long DspaStatus) {
        this.DspaStatus = DspaStatus;
    }

    /**
     * Get 模板状态 0: 正常   1: 已删除 
     * @return DspaCgStatus 模板状态 0: 正常   1: 已删除
     */
    public Long getDspaCgStatus() {
        return this.DspaCgStatus;
    }

    /**
     * Set 模板状态 0: 正常   1: 已删除
     * @param DspaCgStatus 模板状态 0: 正常   1: 已删除
     */
    public void setDspaCgStatus(Long DspaCgStatus) {
        this.DspaCgStatus = DspaCgStatus;
    }

    public DsgcBindingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DsgcBindingInfo(DsgcBindingInfo source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.DspaCgId != null) {
            this.DspaCgId = new Long(source.DspaCgId);
        }
        if (source.DspaCgName != null) {
            this.DspaCgName = new String(source.DspaCgName);
        }
        if (source.DspaStatus != null) {
            this.DspaStatus = new Long(source.DspaStatus);
        }
        if (source.DspaCgStatus != null) {
            this.DspaCgStatus = new Long(source.DspaCgStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "DspaCgId", this.DspaCgId);
        this.setParamSimple(map, prefix + "DspaCgName", this.DspaCgName);
        this.setParamSimple(map, prefix + "DspaStatus", this.DspaStatus);
        this.setParamSimple(map, prefix + "DspaCgStatus", this.DspaCgStatus);

    }
}

