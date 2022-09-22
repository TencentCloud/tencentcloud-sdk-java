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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnknownPerson extends AbstractModel{

    /**
    * 视觉出现信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoAppearSet")
    @Expose
    private VideoAppearInfo [] VideoAppearSet;

    /**
    * 未知人物是否可以入库(只有当未知人物人脸小图质量分符合要求时才可入库)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PutLibraryAllowed")
    @Expose
    private Boolean PutLibraryAllowed;

    /**
     * Get 视觉出现信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoAppearSet 视觉出现信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VideoAppearInfo [] getVideoAppearSet() {
        return this.VideoAppearSet;
    }

    /**
     * Set 视觉出现信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoAppearSet 视觉出现信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoAppearSet(VideoAppearInfo [] VideoAppearSet) {
        this.VideoAppearSet = VideoAppearSet;
    }

    /**
     * Get 未知人物是否可以入库(只有当未知人物人脸小图质量分符合要求时才可入库)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PutLibraryAllowed 未知人物是否可以入库(只有当未知人物人脸小图质量分符合要求时才可入库)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPutLibraryAllowed() {
        return this.PutLibraryAllowed;
    }

    /**
     * Set 未知人物是否可以入库(只有当未知人物人脸小图质量分符合要求时才可入库)
注意：此字段可能返回 null，表示取不到有效值。
     * @param PutLibraryAllowed 未知人物是否可以入库(只有当未知人物人脸小图质量分符合要求时才可入库)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPutLibraryAllowed(Boolean PutLibraryAllowed) {
        this.PutLibraryAllowed = PutLibraryAllowed;
    }

    public UnknownPerson() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnknownPerson(UnknownPerson source) {
        if (source.VideoAppearSet != null) {
            this.VideoAppearSet = new VideoAppearInfo[source.VideoAppearSet.length];
            for (int i = 0; i < source.VideoAppearSet.length; i++) {
                this.VideoAppearSet[i] = new VideoAppearInfo(source.VideoAppearSet[i]);
            }
        }
        if (source.PutLibraryAllowed != null) {
            this.PutLibraryAllowed = new Boolean(source.PutLibraryAllowed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "VideoAppearSet.", this.VideoAppearSet);
        this.setParamSimple(map, prefix + "PutLibraryAllowed", this.PutLibraryAllowed);

    }
}

