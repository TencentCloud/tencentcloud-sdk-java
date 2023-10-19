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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVulDefenceSettingRequest extends AbstractModel {

    /**
    * 防御开关，0 关闭 1 开启
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 1 全部旗舰版主机，0 Quuids列表主机
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * 作用弄范围内旗舰版主机列表
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
     * Get 防御开关，0 关闭 1 开启 
     * @return Enable 防御开关，0 关闭 1 开启
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 防御开关，0 关闭 1 开启
     * @param Enable 防御开关，0 关闭 1 开启
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 1 全部旗舰版主机，0 Quuids列表主机 
     * @return Scope 1 全部旗舰版主机，0 Quuids列表主机
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set 1 全部旗舰版主机，0 Quuids列表主机
     * @param Scope 1 全部旗舰版主机，0 Quuids列表主机
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 作用弄范围内旗舰版主机列表 
     * @return Quuids 作用弄范围内旗舰版主机列表
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set 作用弄范围内旗舰版主机列表
     * @param Quuids 作用弄范围内旗舰版主机列表
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    public ModifyVulDefenceSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVulDefenceSettingRequest(ModifyVulDefenceSettingRequest source) {
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);

    }
}

