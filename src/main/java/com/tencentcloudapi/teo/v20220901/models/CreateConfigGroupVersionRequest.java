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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateConfigGroupVersionRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 待新建版本的配置组 ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 待导入的配置内容。要求采用 JSON 格式，按照 UTF-8 方式进行编码。配置文件内容可参考下方示例。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 版本描述，可输入最大长度为 50 个字符，可以通过本字段填写该版本的使用场景等。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 待新建版本的配置组 ID。 
     * @return GroupId 待新建版本的配置组 ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 待新建版本的配置组 ID。
     * @param GroupId 待新建版本的配置组 ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 待导入的配置内容。要求采用 JSON 格式，按照 UTF-8 方式进行编码。配置文件内容可参考下方示例。 
     * @return Content 待导入的配置内容。要求采用 JSON 格式，按照 UTF-8 方式进行编码。配置文件内容可参考下方示例。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 待导入的配置内容。要求采用 JSON 格式，按照 UTF-8 方式进行编码。配置文件内容可参考下方示例。
     * @param Content 待导入的配置内容。要求采用 JSON 格式，按照 UTF-8 方式进行编码。配置文件内容可参考下方示例。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 版本描述，可输入最大长度为 50 个字符，可以通过本字段填写该版本的使用场景等。 
     * @return Description 版本描述，可输入最大长度为 50 个字符，可以通过本字段填写该版本的使用场景等。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 版本描述，可输入最大长度为 50 个字符，可以通过本字段填写该版本的使用场景等。
     * @param Description 版本描述，可输入最大长度为 50 个字符，可以通过本字段填写该版本的使用场景等。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateConfigGroupVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConfigGroupVersionRequest(CreateConfigGroupVersionRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

