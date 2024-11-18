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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ThreadToolResources extends AbstractModel {

    /**
    * 文件 ID 列表
    */
    @SerializedName("CodeInterpreter")
    @Expose
    private String [] CodeInterpreter;

    /**
    * 向量存储 ID 列表
    */
    @SerializedName("VectorStoreIDs")
    @Expose
    private String [] VectorStoreIDs;

    /**
     * Get 文件 ID 列表 
     * @return CodeInterpreter 文件 ID 列表
     */
    public String [] getCodeInterpreter() {
        return this.CodeInterpreter;
    }

    /**
     * Set 文件 ID 列表
     * @param CodeInterpreter 文件 ID 列表
     */
    public void setCodeInterpreter(String [] CodeInterpreter) {
        this.CodeInterpreter = CodeInterpreter;
    }

    /**
     * Get 向量存储 ID 列表 
     * @return VectorStoreIDs 向量存储 ID 列表
     */
    public String [] getVectorStoreIDs() {
        return this.VectorStoreIDs;
    }

    /**
     * Set 向量存储 ID 列表
     * @param VectorStoreIDs 向量存储 ID 列表
     */
    public void setVectorStoreIDs(String [] VectorStoreIDs) {
        this.VectorStoreIDs = VectorStoreIDs;
    }

    public ThreadToolResources() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ThreadToolResources(ThreadToolResources source) {
        if (source.CodeInterpreter != null) {
            this.CodeInterpreter = new String[source.CodeInterpreter.length];
            for (int i = 0; i < source.CodeInterpreter.length; i++) {
                this.CodeInterpreter[i] = new String(source.CodeInterpreter[i]);
            }
        }
        if (source.VectorStoreIDs != null) {
            this.VectorStoreIDs = new String[source.VectorStoreIDs.length];
            for (int i = 0; i < source.VectorStoreIDs.length; i++) {
                this.VectorStoreIDs[i] = new String(source.VectorStoreIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CodeInterpreter.", this.CodeInterpreter);
        this.setParamArraySimple(map, prefix + "VectorStoreIDs.", this.VectorStoreIDs);

    }
}

