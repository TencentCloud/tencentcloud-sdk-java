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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MongoDBParam extends AbstractModel{

    /**
    * MongoDB的数据库名称
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * MongoDB的集群
    */
    @SerializedName("Collection")
    @Expose
    private String Collection;

    /**
    * 是否复制存量数据，默认传参true
    */
    @SerializedName("CopyExisting")
    @Expose
    private Boolean CopyExisting;

    /**
    * 实例资源
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * MongoDB的连接ip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * MongoDB的连接port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * MongoDB数据库用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * MongoDB数据库密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 监听事件类型，为空时表示全选。取值包括insert,update,replace,delete,invalidate,drop,dropdatabase,rename，多个类型间使用,逗号分隔
    */
    @SerializedName("ListeningEvent")
    @Expose
    private String ListeningEvent;

    /**
    * 主从优先级，默认主节点
    */
    @SerializedName("ReadPreference")
    @Expose
    private String ReadPreference;

    /**
    * 聚合管道
    */
    @SerializedName("Pipeline")
    @Expose
    private String Pipeline;

    /**
    * 是否为自建集群
    */
    @SerializedName("SelfBuilt")
    @Expose
    private Boolean SelfBuilt;

    /**
     * Get MongoDB的数据库名称 
     * @return Database MongoDB的数据库名称
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set MongoDB的数据库名称
     * @param Database MongoDB的数据库名称
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get MongoDB的集群 
     * @return Collection MongoDB的集群
     */
    public String getCollection() {
        return this.Collection;
    }

    /**
     * Set MongoDB的集群
     * @param Collection MongoDB的集群
     */
    public void setCollection(String Collection) {
        this.Collection = Collection;
    }

    /**
     * Get 是否复制存量数据，默认传参true 
     * @return CopyExisting 是否复制存量数据，默认传参true
     */
    public Boolean getCopyExisting() {
        return this.CopyExisting;
    }

    /**
     * Set 是否复制存量数据，默认传参true
     * @param CopyExisting 是否复制存量数据，默认传参true
     */
    public void setCopyExisting(Boolean CopyExisting) {
        this.CopyExisting = CopyExisting;
    }

    /**
     * Get 实例资源 
     * @return Resource 实例资源
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 实例资源
     * @param Resource 实例资源
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get MongoDB的连接ip 
     * @return Ip MongoDB的连接ip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set MongoDB的连接ip
     * @param Ip MongoDB的连接ip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get MongoDB的连接port 
     * @return Port MongoDB的连接port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set MongoDB的连接port
     * @param Port MongoDB的连接port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get MongoDB数据库用户名 
     * @return UserName MongoDB数据库用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set MongoDB数据库用户名
     * @param UserName MongoDB数据库用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get MongoDB数据库密码 
     * @return Password MongoDB数据库密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set MongoDB数据库密码
     * @param Password MongoDB数据库密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 监听事件类型，为空时表示全选。取值包括insert,update,replace,delete,invalidate,drop,dropdatabase,rename，多个类型间使用,逗号分隔 
     * @return ListeningEvent 监听事件类型，为空时表示全选。取值包括insert,update,replace,delete,invalidate,drop,dropdatabase,rename，多个类型间使用,逗号分隔
     */
    public String getListeningEvent() {
        return this.ListeningEvent;
    }

    /**
     * Set 监听事件类型，为空时表示全选。取值包括insert,update,replace,delete,invalidate,drop,dropdatabase,rename，多个类型间使用,逗号分隔
     * @param ListeningEvent 监听事件类型，为空时表示全选。取值包括insert,update,replace,delete,invalidate,drop,dropdatabase,rename，多个类型间使用,逗号分隔
     */
    public void setListeningEvent(String ListeningEvent) {
        this.ListeningEvent = ListeningEvent;
    }

    /**
     * Get 主从优先级，默认主节点 
     * @return ReadPreference 主从优先级，默认主节点
     */
    public String getReadPreference() {
        return this.ReadPreference;
    }

    /**
     * Set 主从优先级，默认主节点
     * @param ReadPreference 主从优先级，默认主节点
     */
    public void setReadPreference(String ReadPreference) {
        this.ReadPreference = ReadPreference;
    }

    /**
     * Get 聚合管道 
     * @return Pipeline 聚合管道
     */
    public String getPipeline() {
        return this.Pipeline;
    }

    /**
     * Set 聚合管道
     * @param Pipeline 聚合管道
     */
    public void setPipeline(String Pipeline) {
        this.Pipeline = Pipeline;
    }

    /**
     * Get 是否为自建集群 
     * @return SelfBuilt 是否为自建集群
     */
    public Boolean getSelfBuilt() {
        return this.SelfBuilt;
    }

    /**
     * Set 是否为自建集群
     * @param SelfBuilt 是否为自建集群
     */
    public void setSelfBuilt(Boolean SelfBuilt) {
        this.SelfBuilt = SelfBuilt;
    }

    public MongoDBParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MongoDBParam(MongoDBParam source) {
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Collection != null) {
            this.Collection = new String(source.Collection);
        }
        if (source.CopyExisting != null) {
            this.CopyExisting = new Boolean(source.CopyExisting);
        }
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ListeningEvent != null) {
            this.ListeningEvent = new String(source.ListeningEvent);
        }
        if (source.ReadPreference != null) {
            this.ReadPreference = new String(source.ReadPreference);
        }
        if (source.Pipeline != null) {
            this.Pipeline = new String(source.Pipeline);
        }
        if (source.SelfBuilt != null) {
            this.SelfBuilt = new Boolean(source.SelfBuilt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Collection", this.Collection);
        this.setParamSimple(map, prefix + "CopyExisting", this.CopyExisting);
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ListeningEvent", this.ListeningEvent);
        this.setParamSimple(map, prefix + "ReadPreference", this.ReadPreference);
        this.setParamSimple(map, prefix + "Pipeline", this.Pipeline);
        this.setParamSimple(map, prefix + "SelfBuilt", this.SelfBuilt);

    }
}

