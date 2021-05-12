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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FrameTagRec extends AbstractModel{

    /**
    * 标签类型：
"Common": 通用类型
"Game":游戏类型
    */
    @SerializedName("TagType")
    @Expose
    private String TagType;

    /**
    * 游戏具体类型:
"HonorOfKings_AnchorViews":王者荣耀主播视角
"HonorOfKings_GameViews":王者荣耀比赛视角
"LOL_AnchorViews":英雄联盟主播视角
"LOL_GameViews":英雄联盟比赛视角
"PUBG_AnchorViews":和平精英主播视角
"PUBG_GameViews":和平精英比赛视角
    */
    @SerializedName("GameExtendType")
    @Expose
    private String GameExtendType;

    /**
     * Get 标签类型：
"Common": 通用类型
"Game":游戏类型 
     * @return TagType 标签类型：
"Common": 通用类型
"Game":游戏类型
     */
    public String getTagType() {
        return this.TagType;
    }

    /**
     * Set 标签类型：
"Common": 通用类型
"Game":游戏类型
     * @param TagType 标签类型：
"Common": 通用类型
"Game":游戏类型
     */
    public void setTagType(String TagType) {
        this.TagType = TagType;
    }

    /**
     * Get 游戏具体类型:
"HonorOfKings_AnchorViews":王者荣耀主播视角
"HonorOfKings_GameViews":王者荣耀比赛视角
"LOL_AnchorViews":英雄联盟主播视角
"LOL_GameViews":英雄联盟比赛视角
"PUBG_AnchorViews":和平精英主播视角
"PUBG_GameViews":和平精英比赛视角 
     * @return GameExtendType 游戏具体类型:
"HonorOfKings_AnchorViews":王者荣耀主播视角
"HonorOfKings_GameViews":王者荣耀比赛视角
"LOL_AnchorViews":英雄联盟主播视角
"LOL_GameViews":英雄联盟比赛视角
"PUBG_AnchorViews":和平精英主播视角
"PUBG_GameViews":和平精英比赛视角
     */
    public String getGameExtendType() {
        return this.GameExtendType;
    }

    /**
     * Set 游戏具体类型:
"HonorOfKings_AnchorViews":王者荣耀主播视角
"HonorOfKings_GameViews":王者荣耀比赛视角
"LOL_AnchorViews":英雄联盟主播视角
"LOL_GameViews":英雄联盟比赛视角
"PUBG_AnchorViews":和平精英主播视角
"PUBG_GameViews":和平精英比赛视角
     * @param GameExtendType 游戏具体类型:
"HonorOfKings_AnchorViews":王者荣耀主播视角
"HonorOfKings_GameViews":王者荣耀比赛视角
"LOL_AnchorViews":英雄联盟主播视角
"LOL_GameViews":英雄联盟比赛视角
"PUBG_AnchorViews":和平精英主播视角
"PUBG_GameViews":和平精英比赛视角
     */
    public void setGameExtendType(String GameExtendType) {
        this.GameExtendType = GameExtendType;
    }

    public FrameTagRec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FrameTagRec(FrameTagRec source) {
        if (source.TagType != null) {
            this.TagType = new String(source.TagType);
        }
        if (source.GameExtendType != null) {
            this.GameExtendType = new String(source.GameExtendType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagType", this.TagType);
        this.setParamSimple(map, prefix + "GameExtendType", this.GameExtendType);

    }
}

