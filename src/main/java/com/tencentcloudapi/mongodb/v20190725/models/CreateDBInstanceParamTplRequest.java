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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBInstanceParamTplRequest extends AbstractModel {

    /**
    * 参数模板名称。
    */
    @SerializedName("TplName")
    @Expose
    private String TplName;

    /**
    * 版本号，该参数模板支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。参数与版本对应关系是：MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本，MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。当MirrorTplId为空时，该字段必填。
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * 实例类型，REPLSET-副本集，SHARD-分片集群，STANDALONE-单节点
当MirrorTplId为空时，该字段必填。
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 模板描述信息。
    */
    @SerializedName("TplDesc")
    @Expose
    private String TplDesc;

    /**
    * 模板参数，若为空，则以系统默认模板作为新版本参数。
    */
    @SerializedName("Params")
    @Expose
    private ParamType [] Params;

    /**
    * 镜像模板ID，若该字段不为空，则以该模板为镜像，克隆出一个新的模板。注意：MirrorTplId不为空时，MongoVersion及ClusterType将以MirrorTpl模板的版本及实例类型为准。
    */
    @SerializedName("MirrorTplId")
    @Expose
    private String MirrorTplId;

    /**
     * Get 参数模板名称。 
     * @return TplName 参数模板名称。
     */
    public String getTplName() {
        return this.TplName;
    }

    /**
     * Set 参数模板名称。
     * @param TplName 参数模板名称。
     */
    public void setTplName(String TplName) {
        this.TplName = TplName;
    }

    /**
     * Get 版本号，该参数模板支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。参数与版本对应关系是：MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本，MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。当MirrorTplId为空时，该字段必填。 
     * @return MongoVersion 版本号，该参数模板支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。参数与版本对应关系是：MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本，MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。当MirrorTplId为空时，该字段必填。
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set 版本号，该参数模板支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。参数与版本对应关系是：MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本，MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。当MirrorTplId为空时，该字段必填。
     * @param MongoVersion 版本号，该参数模板支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。参数与版本对应关系是：MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本，MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。当MirrorTplId为空时，该字段必填。
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get 实例类型，REPLSET-副本集，SHARD-分片集群，STANDALONE-单节点
当MirrorTplId为空时，该字段必填。 
     * @return ClusterType 实例类型，REPLSET-副本集，SHARD-分片集群，STANDALONE-单节点
当MirrorTplId为空时，该字段必填。
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 实例类型，REPLSET-副本集，SHARD-分片集群，STANDALONE-单节点
当MirrorTplId为空时，该字段必填。
     * @param ClusterType 实例类型，REPLSET-副本集，SHARD-分片集群，STANDALONE-单节点
当MirrorTplId为空时，该字段必填。
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 模板描述信息。 
     * @return TplDesc 模板描述信息。
     */
    public String getTplDesc() {
        return this.TplDesc;
    }

    /**
     * Set 模板描述信息。
     * @param TplDesc 模板描述信息。
     */
    public void setTplDesc(String TplDesc) {
        this.TplDesc = TplDesc;
    }

    /**
     * Get 模板参数，若为空，则以系统默认模板作为新版本参数。 
     * @return Params 模板参数，若为空，则以系统默认模板作为新版本参数。
     */
    public ParamType [] getParams() {
        return this.Params;
    }

    /**
     * Set 模板参数，若为空，则以系统默认模板作为新版本参数。
     * @param Params 模板参数，若为空，则以系统默认模板作为新版本参数。
     */
    public void setParams(ParamType [] Params) {
        this.Params = Params;
    }

    /**
     * Get 镜像模板ID，若该字段不为空，则以该模板为镜像，克隆出一个新的模板。注意：MirrorTplId不为空时，MongoVersion及ClusterType将以MirrorTpl模板的版本及实例类型为准。 
     * @return MirrorTplId 镜像模板ID，若该字段不为空，则以该模板为镜像，克隆出一个新的模板。注意：MirrorTplId不为空时，MongoVersion及ClusterType将以MirrorTpl模板的版本及实例类型为准。
     */
    public String getMirrorTplId() {
        return this.MirrorTplId;
    }

    /**
     * Set 镜像模板ID，若该字段不为空，则以该模板为镜像，克隆出一个新的模板。注意：MirrorTplId不为空时，MongoVersion及ClusterType将以MirrorTpl模板的版本及实例类型为准。
     * @param MirrorTplId 镜像模板ID，若该字段不为空，则以该模板为镜像，克隆出一个新的模板。注意：MirrorTplId不为空时，MongoVersion及ClusterType将以MirrorTpl模板的版本及实例类型为准。
     */
    public void setMirrorTplId(String MirrorTplId) {
        this.MirrorTplId = MirrorTplId;
    }

    public CreateDBInstanceParamTplRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBInstanceParamTplRequest(CreateDBInstanceParamTplRequest source) {
        if (source.TplName != null) {
            this.TplName = new String(source.TplName);
        }
        if (source.MongoVersion != null) {
            this.MongoVersion = new String(source.MongoVersion);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.TplDesc != null) {
            this.TplDesc = new String(source.TplDesc);
        }
        if (source.Params != null) {
            this.Params = new ParamType[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new ParamType(source.Params[i]);
            }
        }
        if (source.MirrorTplId != null) {
            this.MirrorTplId = new String(source.MirrorTplId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TplName", this.TplName);
        this.setParamSimple(map, prefix + "MongoVersion", this.MongoVersion);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "TplDesc", this.TplDesc);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamSimple(map, prefix + "MirrorTplId", this.MirrorTplId);

    }
}

