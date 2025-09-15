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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SqlAgentParameter extends AbstractModel {

    /**
    * 数据库实例信息列表
    */
    @SerializedName("InstanceInfos")
    @Expose
    private InstanceInfos [] InstanceInfos;

    /**
    * 代码仓库信息
    */
    @SerializedName("CodeRepo")
    @Expose
    private CodeRepo CodeRepo;

    /**
     * Get 数据库实例信息列表 
     * @return InstanceInfos 数据库实例信息列表
     */
    public InstanceInfos [] getInstanceInfos() {
        return this.InstanceInfos;
    }

    /**
     * Set 数据库实例信息列表
     * @param InstanceInfos 数据库实例信息列表
     */
    public void setInstanceInfos(InstanceInfos [] InstanceInfos) {
        this.InstanceInfos = InstanceInfos;
    }

    /**
     * Get 代码仓库信息 
     * @return CodeRepo 代码仓库信息
     */
    public CodeRepo getCodeRepo() {
        return this.CodeRepo;
    }

    /**
     * Set 代码仓库信息
     * @param CodeRepo 代码仓库信息
     */
    public void setCodeRepo(CodeRepo CodeRepo) {
        this.CodeRepo = CodeRepo;
    }

    public SqlAgentParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SqlAgentParameter(SqlAgentParameter source) {
        if (source.InstanceInfos != null) {
            this.InstanceInfos = new InstanceInfos[source.InstanceInfos.length];
            for (int i = 0; i < source.InstanceInfos.length; i++) {
                this.InstanceInfos[i] = new InstanceInfos(source.InstanceInfos[i]);
            }
        }
        if (source.CodeRepo != null) {
            this.CodeRepo = new CodeRepo(source.CodeRepo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InstanceInfos.", this.InstanceInfos);
        this.setParamObj(map, prefix + "CodeRepo.", this.CodeRepo);

    }
}

