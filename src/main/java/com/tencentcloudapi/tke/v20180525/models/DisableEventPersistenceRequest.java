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

public class DisableEventPersistenceRequest extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>取值为true代表关闭集群审计时删除默认创建的日志集和主题，false代表不删除</p>
    */
    @SerializedName("DeleteLogSetAndTopic")
    @Expose
    private Boolean DeleteLogSetAndTopic;

    /**
    * <p>集群类型 tke/eks</p><p>默认值：tke</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

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
     * Get <p>取值为true代表关闭集群审计时删除默认创建的日志集和主题，false代表不删除</p> 
     * @return DeleteLogSetAndTopic <p>取值为true代表关闭集群审计时删除默认创建的日志集和主题，false代表不删除</p>
     */
    public Boolean getDeleteLogSetAndTopic() {
        return this.DeleteLogSetAndTopic;
    }

    /**
     * Set <p>取值为true代表关闭集群审计时删除默认创建的日志集和主题，false代表不删除</p>
     * @param DeleteLogSetAndTopic <p>取值为true代表关闭集群审计时删除默认创建的日志集和主题，false代表不删除</p>
     */
    public void setDeleteLogSetAndTopic(Boolean DeleteLogSetAndTopic) {
        this.DeleteLogSetAndTopic = DeleteLogSetAndTopic;
    }

    /**
     * Get <p>集群类型 tke/eks</p><p>默认值：tke</p> 
     * @return ClusterType <p>集群类型 tke/eks</p><p>默认值：tke</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型 tke/eks</p><p>默认值：tke</p>
     * @param ClusterType <p>集群类型 tke/eks</p><p>默认值：tke</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    public DisableEventPersistenceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisableEventPersistenceRequest(DisableEventPersistenceRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.DeleteLogSetAndTopic != null) {
            this.DeleteLogSetAndTopic = new Boolean(source.DeleteLogSetAndTopic);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "DeleteLogSetAndTopic", this.DeleteLogSetAndTopic);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);

    }
}

