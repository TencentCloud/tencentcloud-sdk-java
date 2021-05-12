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
package com.tencentcloudapi.apcas.v20201127.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadIdRequest extends AbstractModel{

    /**
    * id标志的类型: 0:imei 7:IDFA 8:MD5(imei)
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * ID列表（ID间使用换行符分割、然后使用Base64编码）
    */
    @SerializedName("IdListBase64")
    @Expose
    private String IdListBase64;

    /**
     * Get id标志的类型: 0:imei 7:IDFA 8:MD5(imei) 
     * @return Type id标志的类型: 0:imei 7:IDFA 8:MD5(imei)
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set id标志的类型: 0:imei 7:IDFA 8:MD5(imei)
     * @param Type id标志的类型: 0:imei 7:IDFA 8:MD5(imei)
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get ID列表（ID间使用换行符分割、然后使用Base64编码） 
     * @return IdListBase64 ID列表（ID间使用换行符分割、然后使用Base64编码）
     */
    public String getIdListBase64() {
        return this.IdListBase64;
    }

    /**
     * Set ID列表（ID间使用换行符分割、然后使用Base64编码）
     * @param IdListBase64 ID列表（ID间使用换行符分割、然后使用Base64编码）
     */
    public void setIdListBase64(String IdListBase64) {
        this.IdListBase64 = IdListBase64;
    }

    public UploadIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadIdRequest(UploadIdRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.IdListBase64 != null) {
            this.IdListBase64 = new String(source.IdListBase64);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "IdListBase64", this.IdListBase64);

    }
}

