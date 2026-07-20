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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyFwGroupSwitchRequest extends AbstractModel {

    /**
    * <p>打开或关闭开关<br>0：关闭开关<br>1：打开开关</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>是否操作全部开关 0 不操作全部开关，1 操作全部开关</p>
    */
    @SerializedName("AllSwitch")
    @Expose
    private Long AllSwitch;

    /**
    * <p>开关列表</p>
    */
    @SerializedName("SwitchList")
    @Expose
    private FwGroupSwitch [] SwitchList;

    /**
     * Get <p>打开或关闭开关<br>0：关闭开关<br>1：打开开关</p> 
     * @return Enable <p>打开或关闭开关<br>0：关闭开关<br>1：打开开关</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>打开或关闭开关<br>0：关闭开关<br>1：打开开关</p>
     * @param Enable <p>打开或关闭开关<br>0：关闭开关<br>1：打开开关</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>是否操作全部开关 0 不操作全部开关，1 操作全部开关</p> 
     * @return AllSwitch <p>是否操作全部开关 0 不操作全部开关，1 操作全部开关</p>
     */
    public Long getAllSwitch() {
        return this.AllSwitch;
    }

    /**
     * Set <p>是否操作全部开关 0 不操作全部开关，1 操作全部开关</p>
     * @param AllSwitch <p>是否操作全部开关 0 不操作全部开关，1 操作全部开关</p>
     */
    public void setAllSwitch(Long AllSwitch) {
        this.AllSwitch = AllSwitch;
    }

    /**
     * Get <p>开关列表</p> 
     * @return SwitchList <p>开关列表</p>
     */
    public FwGroupSwitch [] getSwitchList() {
        return this.SwitchList;
    }

    /**
     * Set <p>开关列表</p>
     * @param SwitchList <p>开关列表</p>
     */
    public void setSwitchList(FwGroupSwitch [] SwitchList) {
        this.SwitchList = SwitchList;
    }

    public ModifyFwGroupSwitchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFwGroupSwitchRequest(ModifyFwGroupSwitchRequest source) {
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.AllSwitch != null) {
            this.AllSwitch = new Long(source.AllSwitch);
        }
        if (source.SwitchList != null) {
            this.SwitchList = new FwGroupSwitch[source.SwitchList.length];
            for (int i = 0; i < source.SwitchList.length; i++) {
                this.SwitchList[i] = new FwGroupSwitch(source.SwitchList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "AllSwitch", this.AllSwitch);
        this.setParamArrayObj(map, prefix + "SwitchList.", this.SwitchList);

    }
}

