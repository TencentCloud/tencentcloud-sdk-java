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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Multimedia extends AbstractModel {

    /**
    * 多媒体类型，可选值包括 image、music、album、playlist。
说明：
1. image：图片；music：单曲，类型为单曲时，会返回详细歌手和歌曲信息；album：专辑；playlist：歌单。
2. 当 type 为 music、album、playlist 时，需要配合 [QQ音乐SDK](https://developer.y.qq.com/) 使用。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 多媒体地址。
说明：
1. type 为 image 时，地址为图片的预览地址；其他类型时，地址为封面图地址。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 多媒体详情地址。
说明：
1. 仅 type 为 image 时，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
    * 名称。
说明：
1. type 为 image 时，该字段为空。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 歌手名称。
说明：
1. 仅 type 为 music 时，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Singer")
    @Expose
    private String Singer;

    /**
    * 歌曲详情。
说明：
1. 仅 type 为 music 时，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ext")
    @Expose
    private SongExt Ext;

    /**
     * Get 多媒体类型，可选值包括 image、music、album、playlist。
说明：
1. image：图片；music：单曲，类型为单曲时，会返回详细歌手和歌曲信息；album：专辑；playlist：歌单。
2. 当 type 为 music、album、playlist 时，需要配合 [QQ音乐SDK](https://developer.y.qq.com/) 使用。 
     * @return Type 多媒体类型，可选值包括 image、music、album、playlist。
说明：
1. image：图片；music：单曲，类型为单曲时，会返回详细歌手和歌曲信息；album：专辑；playlist：歌单。
2. 当 type 为 music、album、playlist 时，需要配合 [QQ音乐SDK](https://developer.y.qq.com/) 使用。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 多媒体类型，可选值包括 image、music、album、playlist。
说明：
1. image：图片；music：单曲，类型为单曲时，会返回详细歌手和歌曲信息；album：专辑；playlist：歌单。
2. 当 type 为 music、album、playlist 时，需要配合 [QQ音乐SDK](https://developer.y.qq.com/) 使用。
     * @param Type 多媒体类型，可选值包括 image、music、album、playlist。
说明：
1. image：图片；music：单曲，类型为单曲时，会返回详细歌手和歌曲信息；album：专辑；playlist：歌单。
2. 当 type 为 music、album、playlist 时，需要配合 [QQ音乐SDK](https://developer.y.qq.com/) 使用。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 多媒体地址。
说明：
1. type 为 image 时，地址为图片的预览地址；其他类型时，地址为封面图地址。 
     * @return Url 多媒体地址。
说明：
1. type 为 image 时，地址为图片的预览地址；其他类型时，地址为封面图地址。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 多媒体地址。
说明：
1. type 为 image 时，地址为图片的预览地址；其他类型时，地址为封面图地址。
     * @param Url 多媒体地址。
说明：
1. type 为 image 时，地址为图片的预览地址；其他类型时，地址为封面图地址。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 多媒体详情地址。
说明：
1. 仅 type 为 image 时，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JumpUrl 多媒体详情地址。
说明：
1. 仅 type 为 image 时，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 多媒体详情地址。
说明：
1. 仅 type 为 image 时，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param JumpUrl 多媒体详情地址。
说明：
1. 仅 type 为 image 时，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    /**
     * Get 名称。
说明：
1. type 为 image 时，该字段为空。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Title 名称。
说明：
1. type 为 image 时，该字段为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 名称。
说明：
1. type 为 image 时，该字段为空。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Title 名称。
说明：
1. type 为 image 时，该字段为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Desc 描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Desc 描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 歌手名称。
说明：
1. 仅 type 为 music 时，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Singer 歌手名称。
说明：
1. 仅 type 为 music 时，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSinger() {
        return this.Singer;
    }

    /**
     * Set 歌手名称。
说明：
1. 仅 type 为 music 时，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Singer 歌手名称。
说明：
1. 仅 type 为 music 时，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSinger(String Singer) {
        this.Singer = Singer;
    }

    /**
     * Get 歌曲详情。
说明：
1. 仅 type 为 music 时，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ext 歌曲详情。
说明：
1. 仅 type 为 music 时，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SongExt getExt() {
        return this.Ext;
    }

    /**
     * Set 歌曲详情。
说明：
1. 仅 type 为 music 时，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ext 歌曲详情。
说明：
1. 仅 type 为 music 时，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExt(SongExt Ext) {
        this.Ext = Ext;
    }

    public Multimedia() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Multimedia(Multimedia source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Singer != null) {
            this.Singer = new String(source.Singer);
        }
        if (source.Ext != null) {
            this.Ext = new SongExt(source.Ext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Singer", this.Singer);
        this.setParamObj(map, prefix + "Ext.", this.Ext);

    }
}

