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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateGroupRequest extends AbstractModel{

    /**
    * 人体库名称，[1,60]个字符，可修改，不可重复。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 人体库 ID，不可修改，不可重复。支持英文、数字、-%@#&_，长度限制64B。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 人体库信息备注，[0，40]个字符。
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 人体识别所用的算法模型版本。 
目前入参仅支持 “1.0”1个输入。 默认为"1.0"。  
不同算法模型版本对应的人体识别算法不同，新版本的整体效果会优于旧版本，后续我们将推出更新版本。
    */
    @SerializedName("BodyModelVersion")
    @Expose
    private String BodyModelVersion;

    /**
     * Get 人体库名称，[1,60]个字符，可修改，不可重复。 
     * @return GroupName 人体库名称，[1,60]个字符，可修改，不可重复。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 人体库名称，[1,60]个字符，可修改，不可重复。
     * @param GroupName 人体库名称，[1,60]个字符，可修改，不可重复。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 人体库 ID，不可修改，不可重复。支持英文、数字、-%@#&_，长度限制64B。 
     * @return GroupId 人体库 ID，不可修改，不可重复。支持英文、数字、-%@#&_，长度限制64B。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 人体库 ID，不可修改，不可重复。支持英文、数字、-%@#&_，长度限制64B。
     * @param GroupId 人体库 ID，不可修改，不可重复。支持英文、数字、-%@#&_，长度限制64B。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 人体库信息备注，[0，40]个字符。 
     * @return Tag 人体库信息备注，[0，40]个字符。
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 人体库信息备注，[0，40]个字符。
     * @param Tag 人体库信息备注，[0，40]个字符。
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 人体识别所用的算法模型版本。 
目前入参仅支持 “1.0”1个输入。 默认为"1.0"。  
不同算法模型版本对应的人体识别算法不同，新版本的整体效果会优于旧版本，后续我们将推出更新版本。 
     * @return BodyModelVersion 人体识别所用的算法模型版本。 
目前入参仅支持 “1.0”1个输入。 默认为"1.0"。  
不同算法模型版本对应的人体识别算法不同，新版本的整体效果会优于旧版本，后续我们将推出更新版本。
     */
    public String getBodyModelVersion() {
        return this.BodyModelVersion;
    }

    /**
     * Set 人体识别所用的算法模型版本。 
目前入参仅支持 “1.0”1个输入。 默认为"1.0"。  
不同算法模型版本对应的人体识别算法不同，新版本的整体效果会优于旧版本，后续我们将推出更新版本。
     * @param BodyModelVersion 人体识别所用的算法模型版本。 
目前入参仅支持 “1.0”1个输入。 默认为"1.0"。  
不同算法模型版本对应的人体识别算法不同，新版本的整体效果会优于旧版本，后续我们将推出更新版本。
     */
    public void setBodyModelVersion(String BodyModelVersion) {
        this.BodyModelVersion = BodyModelVersion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "BodyModelVersion", this.BodyModelVersion);

    }
}

