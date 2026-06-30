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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInput extends AbstractModel {

    /**
    * <p>数据ID</p>
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * <p>任务名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>任务输入</p>
    */
    @SerializedName("Input")
    @Expose
    private StorageInfo Input;

    /**
    * <p>视频解码参数</p>
    */
    @SerializedName("DecodeParams")
    @Expose
    private DecodeParams DecodeParams;

    /**
     * Get <p>数据ID</p> 
     * @return DataId <p>数据ID</p>
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set <p>数据ID</p>
     * @param DataId <p>数据ID</p>
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get <p>任务名</p> 
     * @return Name <p>任务名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>任务名</p>
     * @param Name <p>任务名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>任务输入</p> 
     * @return Input <p>任务输入</p>
     */
    public StorageInfo getInput() {
        return this.Input;
    }

    /**
     * Set <p>任务输入</p>
     * @param Input <p>任务输入</p>
     */
    public void setInput(StorageInfo Input) {
        this.Input = Input;
    }

    /**
     * Get <p>视频解码参数</p> 
     * @return DecodeParams <p>视频解码参数</p>
     */
    public DecodeParams getDecodeParams() {
        return this.DecodeParams;
    }

    /**
     * Set <p>视频解码参数</p>
     * @param DecodeParams <p>视频解码参数</p>
     */
    public void setDecodeParams(DecodeParams DecodeParams) {
        this.DecodeParams = DecodeParams;
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
        if (source.DecodeParams != null) {
            this.DecodeParams = new DecodeParams(source.DecodeParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "DecodeParams.", this.DecodeParams);

    }
}

