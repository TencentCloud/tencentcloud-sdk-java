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

public class PortRiskAdvanceCFGParamItem extends AbstractModel {

    /**
    * 端口集合,以逗号分隔
    */
    @SerializedName("PortSets")
    @Expose
    private String PortSets;

    /**
    * 检测项类型，0-系统定义，1-用户自定义
    */
    @SerializedName("CheckType")
    @Expose
    private Long CheckType;

    /**
    * 检测项描述
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * 是否启用，1-启用，0-禁用
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
     * Get 端口集合,以逗号分隔 
     * @return PortSets 端口集合,以逗号分隔
     */
    public String getPortSets() {
        return this.PortSets;
    }

    /**
     * Set 端口集合,以逗号分隔
     * @param PortSets 端口集合,以逗号分隔
     */
    public void setPortSets(String PortSets) {
        this.PortSets = PortSets;
    }

    /**
     * Get 检测项类型，0-系统定义，1-用户自定义 
     * @return CheckType 检测项类型，0-系统定义，1-用户自定义
     */
    public Long getCheckType() {
        return this.CheckType;
    }

    /**
     * Set 检测项类型，0-系统定义，1-用户自定义
     * @param CheckType 检测项类型，0-系统定义，1-用户自定义
     */
    public void setCheckType(Long CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get 检测项描述 
     * @return Detail 检测项描述
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 检测项描述
     * @param Detail 检测项描述
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 是否启用，1-启用，0-禁用 
     * @return Enable 是否启用，1-启用，0-禁用
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否启用，1-启用，0-禁用
     * @param Enable 是否启用，1-启用，0-禁用
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    public PortRiskAdvanceCFGParamItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PortRiskAdvanceCFGParamItem(PortRiskAdvanceCFGParamItem source) {
        if (source.PortSets != null) {
            this.PortSets = new String(source.PortSets);
        }
        if (source.CheckType != null) {
            this.CheckType = new Long(source.CheckType);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PortSets", this.PortSets);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

