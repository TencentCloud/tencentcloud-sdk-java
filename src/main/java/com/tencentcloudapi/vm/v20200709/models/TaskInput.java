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
package com.tencentcloudapi.vm.v20200709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInput extends AbstractModel{

    /**
    * 数据ID
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * 任务名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 任务输入
    */
    @SerializedName("Input")
    @Expose
    private StorageInfo Input;

    /**
     * Get 数据ID 
     * @return DataId 数据ID
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set 数据ID
     * @param DataId 数据ID
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get 任务名 
     * @return Name 任务名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名
     * @param Name 任务名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 任务输入 
     * @return Input 任务输入
     */
    public StorageInfo getInput() {
        return this.Input;
    }

    /**
     * Set 任务输入
     * @param Input 任务输入
     */
    public void setInput(StorageInfo Input) {
        this.Input = Input;
    }

    public TaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInput(TaskInput source) {
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Input != null) {
            this.Input = new StorageInfo(source.Input);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Input.", this.Input);

    }
}

