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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RotateClusterTokenRequest extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>集群类型，枚举类型：TKEServerless、TKE，为对应集群类型。默认TKE</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>执行操作，枚举类型：CreateNewToken、RevokeOldToken、RecoverOldToken。<br>CreateNewToken：创建新的token并使之生效，注意默认最多有两个token同时生效，需要多个token生效，Force必须为true。<br>RevokeOldToken：删除老的token并使之失效，此时ClusterToken是必传。<br>RecoverOldToken：恢复老的token并使之生效，此时ClusterToken是必传，必须有对应的RevokeOldToken任务且任务成功才可以调用。</p>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * <p>集群token，只有Operation为RevokeOldToken和RecoverOldToken时需要传入。</p>
    */
    @SerializedName("ClusterToken")
    @Expose
    private String ClusterToken;

    /**
    * <p>默认false，只有Operation为CreateNewToken时需要，设置为true时，才可以超过两个token。</p>
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>集群类型，枚举类型：TKEServerless、TKE，为对应集群类型。默认TKE</p> 
     * @return ClusterType <p>集群类型，枚举类型：TKEServerless、TKE，为对应集群类型。默认TKE</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型，枚举类型：TKEServerless、TKE，为对应集群类型。默认TKE</p>
     * @param ClusterType <p>集群类型，枚举类型：TKEServerless、TKE，为对应集群类型。默认TKE</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>执行操作，枚举类型：CreateNewToken、RevokeOldToken、RecoverOldToken。<br>CreateNewToken：创建新的token并使之生效，注意默认最多有两个token同时生效，需要多个token生效，Force必须为true。<br>RevokeOldToken：删除老的token并使之失效，此时ClusterToken是必传。<br>RecoverOldToken：恢复老的token并使之生效，此时ClusterToken是必传，必须有对应的RevokeOldToken任务且任务成功才可以调用。</p> 
     * @return Operation <p>执行操作，枚举类型：CreateNewToken、RevokeOldToken、RecoverOldToken。<br>CreateNewToken：创建新的token并使之生效，注意默认最多有两个token同时生效，需要多个token生效，Force必须为true。<br>RevokeOldToken：删除老的token并使之失效，此时ClusterToken是必传。<br>RecoverOldToken：恢复老的token并使之生效，此时ClusterToken是必传，必须有对应的RevokeOldToken任务且任务成功才可以调用。</p>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set <p>执行操作，枚举类型：CreateNewToken、RevokeOldToken、RecoverOldToken。<br>CreateNewToken：创建新的token并使之生效，注意默认最多有两个token同时生效，需要多个token生效，Force必须为true。<br>RevokeOldToken：删除老的token并使之失效，此时ClusterToken是必传。<br>RecoverOldToken：恢复老的token并使之生效，此时ClusterToken是必传，必须有对应的RevokeOldToken任务且任务成功才可以调用。</p>
     * @param Operation <p>执行操作，枚举类型：CreateNewToken、RevokeOldToken、RecoverOldToken。<br>CreateNewToken：创建新的token并使之生效，注意默认最多有两个token同时生效，需要多个token生效，Force必须为true。<br>RevokeOldToken：删除老的token并使之失效，此时ClusterToken是必传。<br>RecoverOldToken：恢复老的token并使之生效，此时ClusterToken是必传，必须有对应的RevokeOldToken任务且任务成功才可以调用。</p>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get <p>集群token，只有Operation为RevokeOldToken和RecoverOldToken时需要传入。</p> 
     * @return ClusterToken <p>集群token，只有Operation为RevokeOldToken和RecoverOldToken时需要传入。</p>
     */
    public String getClusterToken() {
        return this.ClusterToken;
    }

    /**
     * Set <p>集群token，只有Operation为RevokeOldToken和RecoverOldToken时需要传入。</p>
     * @param ClusterToken <p>集群token，只有Operation为RevokeOldToken和RecoverOldToken时需要传入。</p>
     */
    public void setClusterToken(String ClusterToken) {
        this.ClusterToken = ClusterToken;
    }

    /**
     * Get <p>默认false，只有Operation为CreateNewToken时需要，设置为true时，才可以超过两个token。</p> 
     * @return Force <p>默认false，只有Operation为CreateNewToken时需要，设置为true时，才可以超过两个token。</p>
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set <p>默认false，只有Operation为CreateNewToken时需要，设置为true时，才可以超过两个token。</p>
     * @param Force <p>默认false，只有Operation为CreateNewToken时需要，设置为true时，才可以超过两个token。</p>
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    public RotateClusterTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RotateClusterTokenRequest(RotateClusterTokenRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.ClusterToken != null) {
            this.ClusterToken = new String(source.ClusterToken);
        }
        if (source.Force != null) {
            this.Force = new Boolean(source.Force);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ClusterToken", this.ClusterToken);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

