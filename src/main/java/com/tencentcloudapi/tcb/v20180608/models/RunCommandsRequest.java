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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunCommandsRequest extends AbstractModel {

    /**
    * 待执行命令
    */
    @SerializedName("MgoCommands")
    @Expose
    private MgoCommandParam [] MgoCommands;

    /**
    * 实例ID
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 环境id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * Mongo连接器实例信息
    */
    @SerializedName("MongoConnector")
    @Expose
    private MongoConnector MongoConnector;

    /**
     * Get 待执行命令 
     * @return MgoCommands 待执行命令
     */
    public MgoCommandParam [] getMgoCommands() {
        return this.MgoCommands;
    }

    /**
     * Set 待执行命令
     * @param MgoCommands 待执行命令
     */
    public void setMgoCommands(MgoCommandParam [] MgoCommands) {
        this.MgoCommands = MgoCommands;
    }

    /**
     * Get 实例ID 
     * @return Tag 实例ID
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 实例ID
     * @param Tag 实例ID
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

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
     * Get Mongo连接器实例信息 
     * @return MongoConnector Mongo连接器实例信息
     */
    public MongoConnector getMongoConnector() {
        return this.MongoConnector;
    }

    /**
     * Set Mongo连接器实例信息
     * @param MongoConnector Mongo连接器实例信息
     */
    public void setMongoConnector(MongoConnector MongoConnector) {
        this.MongoConnector = MongoConnector;
    }

    public RunCommandsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunCommandsRequest(RunCommandsRequest source) {
        if (source.MgoCommands != null) {
            this.MgoCommands = new MgoCommandParam[source.MgoCommands.length];
            for (int i = 0; i < source.MgoCommands.length; i++) {
                this.MgoCommands[i] = new MgoCommandParam(source.MgoCommands[i]);
            }
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.MongoConnector != null) {
            this.MongoConnector = new MongoConnector(source.MongoConnector);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MgoCommands.", this.MgoCommands);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamObj(map, prefix + "MongoConnector.", this.MongoConnector);

    }
}

