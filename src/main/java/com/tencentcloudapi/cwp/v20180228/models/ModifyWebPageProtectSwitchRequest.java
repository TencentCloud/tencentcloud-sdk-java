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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWebPageProtectSwitchRequest extends AbstractModel{

    /**
    * 开关类型 1 防护开关  2 自动恢复开关 3 移除防护目录
    */
    @SerializedName("SwitchType")
    @Expose
    private Long SwitchType;

    /**
    * 需要操作开关的网站 最大100条
    */
    @SerializedName("Ids")
    @Expose
    private String [] Ids;

    /**
    * 1 开启 0 关闭 SwitchType 为 1 | 2 必填;
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 开关类型 1 防护开关  2 自动恢复开关 3 移除防护目录 
     * @return SwitchType 开关类型 1 防护开关  2 自动恢复开关 3 移除防护目录
     */
    public Long getSwitchType() {
        return this.SwitchType;
    }

    /**
     * Set 开关类型 1 防护开关  2 自动恢复开关 3 移除防护目录
     * @param SwitchType 开关类型 1 防护开关  2 自动恢复开关 3 移除防护目录
     */
    public void setSwitchType(Long SwitchType) {
        this.SwitchType = SwitchType;
    }

    /**
     * Get 需要操作开关的网站 最大100条 
     * @return Ids 需要操作开关的网站 最大100条
     */
    public String [] getIds() {
        return this.Ids;
    }

    /**
     * Set 需要操作开关的网站 最大100条
     * @param Ids 需要操作开关的网站 最大100条
     */
    public void setIds(String [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get 1 开启 0 关闭 SwitchType 为 1 | 2 必填; 
     * @return Status 1 开启 0 关闭 SwitchType 为 1 | 2 必填;
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1 开启 0 关闭 SwitchType 为 1 | 2 必填;
     * @param Status 1 开启 0 关闭 SwitchType 为 1 | 2 必填;
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyWebPageProtectSwitchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWebPageProtectSwitchRequest(ModifyWebPageProtectSwitchRequest source) {
        if (source.SwitchType != null) {
            this.SwitchType = new Long(source.SwitchType);
        }
        if (source.Ids != null) {
            this.Ids = new String[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new String(source.Ids[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SwitchType", this.SwitchType);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

