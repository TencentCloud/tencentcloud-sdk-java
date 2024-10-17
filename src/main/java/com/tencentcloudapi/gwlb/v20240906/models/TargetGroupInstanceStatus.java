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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetGroupInstanceStatus extends AbstractModel {

    /**
    * 后端rs的IP
    */
    @SerializedName("InstanceIp")
    @Expose
    private String InstanceIp;

    /**
    * 健康检查状态，参数值及含义如下：
● on：表示探测中。
● off：表示健康检查关闭。
● health：表示健康。
● unhealth：表示异常。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 后端rs的IP 
     * @return InstanceIp 后端rs的IP
     */
    public String getInstanceIp() {
        return this.InstanceIp;
    }

    /**
     * Set 后端rs的IP
     * @param InstanceIp 后端rs的IP
     */
    public void setInstanceIp(String InstanceIp) {
        this.InstanceIp = InstanceIp;
    }

    /**
     * Get 健康检查状态，参数值及含义如下：
● on：表示探测中。
● off：表示健康检查关闭。
● health：表示健康。
● unhealth：表示异常。 
     * @return Status 健康检查状态，参数值及含义如下：
● on：表示探测中。
● off：表示健康检查关闭。
● health：表示健康。
● unhealth：表示异常。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 健康检查状态，参数值及含义如下：
● on：表示探测中。
● off：表示健康检查关闭。
● health：表示健康。
● unhealth：表示异常。
     * @param Status 健康检查状态，参数值及含义如下：
● on：表示探测中。
● off：表示健康检查关闭。
● health：表示健康。
● unhealth：表示异常。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public TargetGroupInstanceStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupInstanceStatus(TargetGroupInstanceStatus source) {
        if (source.InstanceIp != null) {
            this.InstanceIp = new String(source.InstanceIp);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceIp", this.InstanceIp);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

