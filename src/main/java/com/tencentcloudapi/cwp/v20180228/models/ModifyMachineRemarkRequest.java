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

public class ModifyMachineRemarkRequest extends AbstractModel{

    /**
    * 主机Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 主机Quuid 
     * @return Quuid 主机Quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机Quuid
     * @param Quuid 主机Quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 备注信息 
     * @return Remark 备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
     * @param Remark 备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyMachineRemarkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMachineRemarkRequest(ModifyMachineRemarkRequest source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

