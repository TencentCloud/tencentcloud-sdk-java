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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgeDetectTaskResult extends AbstractModel{

    /**
    * 数据唯一ID
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * 数据文件的url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 任务状态，0: 已创建，1:运行中，2:正常结束，3:异常结束，4:运行超时
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 任务结果：0: 成年，1:未成年，100:未知
    */
    @SerializedName("Age")
    @Expose
    private Long Age;

    /**
     * Get 数据唯一ID 
     * @return DataId 数据唯一ID
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set 数据唯一ID
     * @param DataId 数据唯一ID
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get 数据文件的url 
     * @return Url 数据文件的url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 数据文件的url
     * @param Url 数据文件的url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 任务状态，0: 已创建，1:运行中，2:正常结束，3:异常结束，4:运行超时 
     * @return Status 任务状态，0: 已创建，1:运行中，2:正常结束，3:异常结束，4:运行超时
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，0: 已创建，1:运行中，2:正常结束，3:异常结束，4:运行超时
     * @param Status 任务状态，0: 已创建，1:运行中，2:正常结束，3:异常结束，4:运行超时
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 任务结果：0: 成年，1:未成年，100:未知 
     * @return Age 任务结果：0: 成年，1:未成年，100:未知
     */
    public Long getAge() {
        return this.Age;
    }

    /**
     * Set 任务结果：0: 成年，1:未成年，100:未知
     * @param Age 任务结果：0: 成年，1:未成年，100:未知
     */
    public void setAge(Long Age) {
        this.Age = Age;
    }

    public AgeDetectTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgeDetectTaskResult(AgeDetectTaskResult source) {
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Age != null) {
            this.Age = new Long(source.Age);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Age", this.Age);

    }
}

