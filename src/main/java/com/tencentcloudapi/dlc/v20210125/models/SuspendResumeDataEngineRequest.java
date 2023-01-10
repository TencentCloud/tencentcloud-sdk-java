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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SuspendResumeDataEngineRequest extends AbstractModel{

    /**
    * 虚拟集群名称
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * 操作类型 suspend/resume
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
     * Get 虚拟集群名称 
     * @return DataEngineName 虚拟集群名称
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set 虚拟集群名称
     * @param DataEngineName 虚拟集群名称
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get 操作类型 suspend/resume 
     * @return Operate 操作类型 suspend/resume
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set 操作类型 suspend/resume
     * @param Operate 操作类型 suspend/resume
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    public SuspendResumeDataEngineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SuspendResumeDataEngineRequest(SuspendResumeDataEngineRequest source) {
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.Operate != null) {
            this.Operate = new String(source.Operate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "Operate", this.Operate);

    }
}

