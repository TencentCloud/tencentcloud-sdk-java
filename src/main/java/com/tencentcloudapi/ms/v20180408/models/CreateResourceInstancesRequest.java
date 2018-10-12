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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateResourceInstancesRequest  extends AbstractModel{

    /**
    * 资源类型id。13624：加固专业版。
    */
    @SerializedName("Pid")
    @Expose
    private Integer Pid;

    /**
    * 时间单位，取值为d，m，y，分别表示天，月，年。
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 时间数量。
    */
    @SerializedName("TimeSpan")
    @Expose
    private Integer TimeSpan;

    /**
    * 资源数量。
    */
    @SerializedName("ResourceNum")
    @Expose
    private Integer ResourceNum;

    /**
     * 获取资源类型id。13624：加固专业版。
     * @return Pid 资源类型id。13624：加固专业版。
     */
    public Integer getPid() {
        return this.Pid;
    }

    /**
     * 设置资源类型id。13624：加固专业版。
     * @param Pid 资源类型id。13624：加固专业版。
     */
    public void setPid(Integer Pid) {
        this.Pid = Pid;
    }

    /**
     * 获取时间单位，取值为d，m，y，分别表示天，月，年。
     * @return TimeUnit 时间单位，取值为d，m，y，分别表示天，月，年。
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * 设置时间单位，取值为d，m，y，分别表示天，月，年。
     * @param TimeUnit 时间单位，取值为d，m，y，分别表示天，月，年。
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * 获取时间数量。
     * @return TimeSpan 时间数量。
     */
    public Integer getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * 设置时间数量。
     * @param TimeSpan 时间数量。
     */
    public void setTimeSpan(Integer TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * 获取资源数量。
     * @return ResourceNum 资源数量。
     */
    public Integer getResourceNum() {
        return this.ResourceNum;
    }

    /**
     * 设置资源数量。
     * @param ResourceNum 资源数量。
     */
    public void setResourceNum(Integer ResourceNum) {
        this.ResourceNum = ResourceNum;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "ResourceNum", this.ResourceNum);

    }
}

