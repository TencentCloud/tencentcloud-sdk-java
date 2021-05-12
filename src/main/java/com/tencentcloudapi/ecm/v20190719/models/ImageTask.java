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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageTask extends AbstractModel{

    /**
    * 镜像导入状态， PENDING, PROCESSING, SUCCESS, FAILED
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 导入失败(FAILED)时， 说明失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 镜像导入状态， PENDING, PROCESSING, SUCCESS, FAILED 
     * @return State 镜像导入状态， PENDING, PROCESSING, SUCCESS, FAILED
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 镜像导入状态， PENDING, PROCESSING, SUCCESS, FAILED
     * @param State 镜像导入状态， PENDING, PROCESSING, SUCCESS, FAILED
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 导入失败(FAILED)时， 说明失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 导入失败(FAILED)时， 说明失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 导入失败(FAILED)时， 说明失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 导入失败(FAILED)时， 说明失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 镜像名称 
     * @return ImageName 镜像名称
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称
     * @param ImageName 镜像名称
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ImageTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageTask(ImageTask source) {
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

