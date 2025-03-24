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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenConstraintInfo extends AbstractModel {

    /**
    * 策略实例名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 策略实例关联事件数
    */
    @SerializedName("EventNums")
    @Expose
    private Long EventNums;

    /**
    * 实例yaml详情base64编码
    */
    @SerializedName("YamlDetail")
    @Expose
    private String YamlDetail;

    /**
     * Get 策略实例名称 
     * @return Name 策略实例名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 策略实例名称
     * @param Name 策略实例名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 策略实例关联事件数 
     * @return EventNums 策略实例关联事件数
     */
    public Long getEventNums() {
        return this.EventNums;
    }

    /**
     * Set 策略实例关联事件数
     * @param EventNums 策略实例关联事件数
     */
    public void setEventNums(Long EventNums) {
        this.EventNums = EventNums;
    }

    /**
     * Get 实例yaml详情base64编码 
     * @return YamlDetail 实例yaml详情base64编码
     */
    public String getYamlDetail() {
        return this.YamlDetail;
    }

    /**
     * Set 实例yaml详情base64编码
     * @param YamlDetail 实例yaml详情base64编码
     */
    public void setYamlDetail(String YamlDetail) {
        this.YamlDetail = YamlDetail;
    }

    public OpenConstraintInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenConstraintInfo(OpenConstraintInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EventNums != null) {
            this.EventNums = new Long(source.EventNums);
        }
        if (source.YamlDetail != null) {
            this.YamlDetail = new String(source.YamlDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EventNums", this.EventNums);
        this.setParamSimple(map, prefix + "YamlDetail", this.YamlDetail);

    }
}

