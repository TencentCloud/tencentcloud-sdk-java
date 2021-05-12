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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaxAgeRule extends AbstractModel{

    /**
    * 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
index: 指定主页生效
    */
    @SerializedName("MaxAgeType")
    @Expose
    private String MaxAgeType;

    /**
    * MaxAgeType 对应类型下的匹配内容：
all 时填充 *
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test/
path 时填充绝对路径，如 /xxx/test.html
index 时填充 /
注意：all规则不可删除，默认遵循源站，可修改。
    */
    @SerializedName("MaxAgeContents")
    @Expose
    private String [] MaxAgeContents;

    /**
    * MaxAge 时间设置，单位秒
注意：时间为0，即不缓存。
    */
    @SerializedName("MaxAgeTime")
    @Expose
    private Long MaxAgeTime;

    /**
    * 是否遵循源站，on或off，开启时忽略时间设置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FollowOrigin")
    @Expose
    private String FollowOrigin;

    /**
     * Get 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
index: 指定主页生效 
     * @return MaxAgeType 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
index: 指定主页生效
     */
    public String getMaxAgeType() {
        return this.MaxAgeType;
    }

    /**
     * Set 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
index: 指定主页生效
     * @param MaxAgeType 规则类型：
all：所有文件生效
file：指定文件后缀生效
directory：指定路径生效
path：指定绝对路径生效
index: 指定主页生效
     */
    public void setMaxAgeType(String MaxAgeType) {
        this.MaxAgeType = MaxAgeType;
    }

    /**
     * Get MaxAgeType 对应类型下的匹配内容：
all 时填充 *
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test/
path 时填充绝对路径，如 /xxx/test.html
index 时填充 /
注意：all规则不可删除，默认遵循源站，可修改。 
     * @return MaxAgeContents MaxAgeType 对应类型下的匹配内容：
all 时填充 *
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test/
path 时填充绝对路径，如 /xxx/test.html
index 时填充 /
注意：all规则不可删除，默认遵循源站，可修改。
     */
    public String [] getMaxAgeContents() {
        return this.MaxAgeContents;
    }

    /**
     * Set MaxAgeType 对应类型下的匹配内容：
all 时填充 *
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test/
path 时填充绝对路径，如 /xxx/test.html
index 时填充 /
注意：all规则不可删除，默认遵循源站，可修改。
     * @param MaxAgeContents MaxAgeType 对应类型下的匹配内容：
all 时填充 *
file 时填充后缀名，如 jpg、txt
directory 时填充路径，如 /xxx/test/
path 时填充绝对路径，如 /xxx/test.html
index 时填充 /
注意：all规则不可删除，默认遵循源站，可修改。
     */
    public void setMaxAgeContents(String [] MaxAgeContents) {
        this.MaxAgeContents = MaxAgeContents;
    }

    /**
     * Get MaxAge 时间设置，单位秒
注意：时间为0，即不缓存。 
     * @return MaxAgeTime MaxAge 时间设置，单位秒
注意：时间为0，即不缓存。
     */
    public Long getMaxAgeTime() {
        return this.MaxAgeTime;
    }

    /**
     * Set MaxAge 时间设置，单位秒
注意：时间为0，即不缓存。
     * @param MaxAgeTime MaxAge 时间设置，单位秒
注意：时间为0，即不缓存。
     */
    public void setMaxAgeTime(Long MaxAgeTime) {
        this.MaxAgeTime = MaxAgeTime;
    }

    /**
     * Get 是否遵循源站，on或off，开启时忽略时间设置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FollowOrigin 是否遵循源站，on或off，开启时忽略时间设置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFollowOrigin() {
        return this.FollowOrigin;
    }

    /**
     * Set 是否遵循源站，on或off，开启时忽略时间设置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FollowOrigin 是否遵循源站，on或off，开启时忽略时间设置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFollowOrigin(String FollowOrigin) {
        this.FollowOrigin = FollowOrigin;
    }

    public MaxAgeRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaxAgeRule(MaxAgeRule source) {
        if (source.MaxAgeType != null) {
            this.MaxAgeType = new String(source.MaxAgeType);
        }
        if (source.MaxAgeContents != null) {
            this.MaxAgeContents = new String[source.MaxAgeContents.length];
            for (int i = 0; i < source.MaxAgeContents.length; i++) {
                this.MaxAgeContents[i] = new String(source.MaxAgeContents[i]);
            }
        }
        if (source.MaxAgeTime != null) {
            this.MaxAgeTime = new Long(source.MaxAgeTime);
        }
        if (source.FollowOrigin != null) {
            this.FollowOrigin = new String(source.FollowOrigin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxAgeType", this.MaxAgeType);
        this.setParamArraySimple(map, prefix + "MaxAgeContents.", this.MaxAgeContents);
        this.setParamSimple(map, prefix + "MaxAgeTime", this.MaxAgeTime);
        this.setParamSimple(map, prefix + "FollowOrigin", this.FollowOrigin);

    }
}

