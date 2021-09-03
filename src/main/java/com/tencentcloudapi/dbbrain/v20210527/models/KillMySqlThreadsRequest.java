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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KillMySqlThreadsRequest extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * kill会话任务的阶段，取值包括："Prepare"-准备阶段，"Commit"-提交阶段。
    */
    @SerializedName("Stage")
    @Expose
    private String Stage;

    /**
    * 需要kill的sql会话ID列表，此参数用于Prepare阶段。
    */
    @SerializedName("Threads")
    @Expose
    private Long [] Threads;

    /**
    * 执行ID，此参数用于Commit阶段。
    */
    @SerializedName("SqlExecId")
    @Expose
    private String SqlExecId;

    /**
    * 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL，默认为"mysql"。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get kill会话任务的阶段，取值包括："Prepare"-准备阶段，"Commit"-提交阶段。 
     * @return Stage kill会话任务的阶段，取值包括："Prepare"-准备阶段，"Commit"-提交阶段。
     */
    public String getStage() {
        return this.Stage;
    }

    /**
     * Set kill会话任务的阶段，取值包括："Prepare"-准备阶段，"Commit"-提交阶段。
     * @param Stage kill会话任务的阶段，取值包括："Prepare"-准备阶段，"Commit"-提交阶段。
     */
    public void setStage(String Stage) {
        this.Stage = Stage;
    }

    /**
     * Get 需要kill的sql会话ID列表，此参数用于Prepare阶段。 
     * @return Threads 需要kill的sql会话ID列表，此参数用于Prepare阶段。
     */
    public Long [] getThreads() {
        return this.Threads;
    }

    /**
     * Set 需要kill的sql会话ID列表，此参数用于Prepare阶段。
     * @param Threads 需要kill的sql会话ID列表，此参数用于Prepare阶段。
     */
    public void setThreads(Long [] Threads) {
        this.Threads = Threads;
    }

    /**
     * Get 执行ID，此参数用于Commit阶段。 
     * @return SqlExecId 执行ID，此参数用于Commit阶段。
     */
    public String getSqlExecId() {
        return this.SqlExecId;
    }

    /**
     * Set 执行ID，此参数用于Commit阶段。
     * @param SqlExecId 执行ID，此参数用于Commit阶段。
     */
    public void setSqlExecId(String SqlExecId) {
        this.SqlExecId = SqlExecId;
    }

    /**
     * Get 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL，默认为"mysql"。 
     * @return Product 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL，默认为"mysql"。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL，默认为"mysql"。
     * @param Product 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL，默认为"mysql"。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public KillMySqlThreadsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KillMySqlThreadsRequest(KillMySqlThreadsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Stage != null) {
            this.Stage = new String(source.Stage);
        }
        if (source.Threads != null) {
            this.Threads = new Long[source.Threads.length];
            for (int i = 0; i < source.Threads.length; i++) {
                this.Threads[i] = new Long(source.Threads[i]);
            }
        }
        if (source.SqlExecId != null) {
            this.SqlExecId = new String(source.SqlExecId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Stage", this.Stage);
        this.setParamArraySimple(map, prefix + "Threads.", this.Threads);
        this.setParamSimple(map, prefix + "SqlExecId", this.SqlExecId);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

