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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourcePackageConf extends AbstractModel {

    /**
    * group名称，当channel为Linear模式并且选择了vod source的时候，该group 名称和channel output的输出组名称对应。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 类型，区分HLS和DASH，可选值：HLS、DASH。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 访问路径。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get group名称，当channel为Linear模式并且选择了vod source的时候，该group 名称和channel output的输出组名称对应。 
     * @return GroupName group名称，当channel为Linear模式并且选择了vod source的时候，该group 名称和channel output的输出组名称对应。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set group名称，当channel为Linear模式并且选择了vod source的时候，该group 名称和channel output的输出组名称对应。
     * @param GroupName group名称，当channel为Linear模式并且选择了vod source的时候，该group 名称和channel output的输出组名称对应。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 类型，区分HLS和DASH，可选值：HLS、DASH。 
     * @return Type 类型，区分HLS和DASH，可选值：HLS、DASH。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型，区分HLS和DASH，可选值：HLS、DASH。
     * @param Type 类型，区分HLS和DASH，可选值：HLS、DASH。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 访问路径。 
     * @return Path 访问路径。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 访问路径。
     * @param Path 访问路径。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public SourcePackageConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourcePackageConf(SourcePackageConf source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

