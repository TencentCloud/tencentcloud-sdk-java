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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceBasicRestartInfo extends AbstractModel{

    /**
    * 服务名，必填，如HDFS
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 如果没传，则表示所有进程
    */
    @SerializedName("ComponentInfoList")
    @Expose
    private ComponentBasicRestartInfo [] ComponentInfoList;

    /**
     * Get 服务名，必填，如HDFS 
     * @return ServiceName 服务名，必填，如HDFS
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名，必填，如HDFS
     * @param ServiceName 服务名，必填，如HDFS
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 如果没传，则表示所有进程 
     * @return ComponentInfoList 如果没传，则表示所有进程
     */
    public ComponentBasicRestartInfo [] getComponentInfoList() {
        return this.ComponentInfoList;
    }

    /**
     * Set 如果没传，则表示所有进程
     * @param ComponentInfoList 如果没传，则表示所有进程
     */
    public void setComponentInfoList(ComponentBasicRestartInfo [] ComponentInfoList) {
        this.ComponentInfoList = ComponentInfoList;
    }

    public ServiceBasicRestartInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceBasicRestartInfo(ServiceBasicRestartInfo source) {
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ComponentInfoList != null) {
            this.ComponentInfoList = new ComponentBasicRestartInfo[source.ComponentInfoList.length];
            for (int i = 0; i < source.ComponentInfoList.length; i++) {
                this.ComponentInfoList[i] = new ComponentBasicRestartInfo(source.ComponentInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamArrayObj(map, prefix + "ComponentInfoList.", this.ComponentInfoList);

    }
}

