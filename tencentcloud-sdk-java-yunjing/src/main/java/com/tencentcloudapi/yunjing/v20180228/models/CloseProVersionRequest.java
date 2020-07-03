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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloseProVersionRequest extends AbstractModel{

    /**
    * 主机唯一标识Uuid。
黑石的InstanceId，CVM的Uuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
     * Get 主机唯一标识Uuid。
黑石的InstanceId，CVM的Uuid 
     * @return Quuid 主机唯一标识Uuid。
黑石的InstanceId，CVM的Uuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机唯一标识Uuid。
黑石的InstanceId，CVM的Uuid
     * @param Quuid 主机唯一标识Uuid。
黑石的InstanceId，CVM的Uuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);

    }
}

