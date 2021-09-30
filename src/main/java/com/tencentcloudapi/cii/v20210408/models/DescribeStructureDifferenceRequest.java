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
package com.tencentcloudapi.cii.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStructureDifferenceRequest extends AbstractModel{

    /**
    * 主任务号
    */
    @SerializedName("MainTaskId")
    @Expose
    private String MainTaskId;

    /**
    * 子任务号
    */
    @SerializedName("SubTaskId")
    @Expose
    private String SubTaskId;

    /**
     * Get 主任务号 
     * @return MainTaskId 主任务号
     */
    public String getMainTaskId() {
        return this.MainTaskId;
    }

    /**
     * Set 主任务号
     * @param MainTaskId 主任务号
     */
    public void setMainTaskId(String MainTaskId) {
        this.MainTaskId = MainTaskId;
    }

    /**
     * Get 子任务号 
     * @return SubTaskId 子任务号
     */
    public String getSubTaskId() {
        return this.SubTaskId;
    }

    /**
     * Set 子任务号
     * @param SubTaskId 子任务号
     */
    public void setSubTaskId(String SubTaskId) {
        this.SubTaskId = SubTaskId;
    }

    public DescribeStructureDifferenceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStructureDifferenceRequest(DescribeStructureDifferenceRequest source) {
        if (source.MainTaskId != null) {
            this.MainTaskId = new String(source.MainTaskId);
        }
        if (source.SubTaskId != null) {
            this.SubTaskId = new String(source.SubTaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MainTaskId", this.MainTaskId);
        this.setParamSimple(map, prefix + "SubTaskId", this.SubTaskId);

    }
}

