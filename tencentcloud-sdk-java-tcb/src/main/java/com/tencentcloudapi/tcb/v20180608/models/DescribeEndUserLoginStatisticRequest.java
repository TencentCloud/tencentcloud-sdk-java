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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEndUserLoginStatisticRequest extends AbstractModel{

    /**
    * 环境id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 终端用户来源
<li> qcloud </li>
<li>miniapp</li>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
     * Get 环境id 
     * @return EnvId 环境id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境id
     * @param EnvId 环境id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 终端用户来源
<li> qcloud </li>
<li>miniapp</li> 
     * @return Source 终端用户来源
<li> qcloud </li>
<li>miniapp</li>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 终端用户来源
<li> qcloud </li>
<li>miniapp</li>
     * @param Source 终端用户来源
<li> qcloud </li>
<li>miniapp</li>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Source", this.Source);

    }
}

