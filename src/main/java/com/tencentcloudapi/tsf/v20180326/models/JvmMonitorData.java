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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JvmMonitorData extends AbstractModel{

    /**
    * 堆内存监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeapMemory")
    @Expose
    private MemoryPicture HeapMemory;

    /**
    * 非堆内存监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NonHeapMemory")
    @Expose
    private MemoryPicture NonHeapMemory;

    /**
    * 伊甸园区监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EdenSpace")
    @Expose
    private MemoryPicture EdenSpace;

    /**
    * 幸存者区监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SurvivorSpace")
    @Expose
    private MemoryPicture SurvivorSpace;

    /**
    * 老年代监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldSpace")
    @Expose
    private MemoryPicture OldSpace;

    /**
    * 元空间监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaSpace")
    @Expose
    private MemoryPicture MetaSpace;

    /**
    * 线程监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThreadPicture")
    @Expose
    private ThreadPicture ThreadPicture;

    /**
    * youngGC增量监控图,一条线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("YoungGC")
    @Expose
    private CurvePoint [] YoungGC;

    /**
    * fullGC增量监控图,一条线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FullGC")
    @Expose
    private CurvePoint [] FullGC;

    /**
    * cpu使用率,一条线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuUsage")
    @Expose
    private CurvePoint [] CpuUsage;

    /**
    * 加载类数,一条线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassCount")
    @Expose
    private CurvePoint [] ClassCount;

    /**
     * Get 堆内存监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeapMemory 堆内存监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MemoryPicture getHeapMemory() {
        return this.HeapMemory;
    }

    /**
     * Set 堆内存监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeapMemory 堆内存监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeapMemory(MemoryPicture HeapMemory) {
        this.HeapMemory = HeapMemory;
    }

    /**
     * Get 非堆内存监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NonHeapMemory 非堆内存监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MemoryPicture getNonHeapMemory() {
        return this.NonHeapMemory;
    }

    /**
     * Set 非堆内存监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
     * @param NonHeapMemory 非堆内存监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNonHeapMemory(MemoryPicture NonHeapMemory) {
        this.NonHeapMemory = NonHeapMemory;
    }

    /**
     * Get 伊甸园区监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EdenSpace 伊甸园区监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MemoryPicture getEdenSpace() {
        return this.EdenSpace;
    }

    /**
     * Set 伊甸园区监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
     * @param EdenSpace 伊甸园区监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEdenSpace(MemoryPicture EdenSpace) {
        this.EdenSpace = EdenSpace;
    }

    /**
     * Get 幸存者区监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SurvivorSpace 幸存者区监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MemoryPicture getSurvivorSpace() {
        return this.SurvivorSpace;
    }

    /**
     * Set 幸存者区监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
     * @param SurvivorSpace 幸存者区监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSurvivorSpace(MemoryPicture SurvivorSpace) {
        this.SurvivorSpace = SurvivorSpace;
    }

    /**
     * Get 老年代监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldSpace 老年代监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MemoryPicture getOldSpace() {
        return this.OldSpace;
    }

    /**
     * Set 老年代监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldSpace 老年代监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldSpace(MemoryPicture OldSpace) {
        this.OldSpace = OldSpace;
    }

    /**
     * Get 元空间监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaSpace 元空间监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MemoryPicture getMetaSpace() {
        return this.MetaSpace;
    }

    /**
     * Set 元空间监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaSpace 元空间监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaSpace(MemoryPicture MetaSpace) {
        this.MetaSpace = MetaSpace;
    }

    /**
     * Get 线程监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThreadPicture 线程监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ThreadPicture getThreadPicture() {
        return this.ThreadPicture;
    }

    /**
     * Set 线程监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThreadPicture 线程监控图,三条线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThreadPicture(ThreadPicture ThreadPicture) {
        this.ThreadPicture = ThreadPicture;
    }

    /**
     * Get youngGC增量监控图,一条线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return YoungGC youngGC增量监控图,一条线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CurvePoint [] getYoungGC() {
        return this.YoungGC;
    }

    /**
     * Set youngGC增量监控图,一条线
注意：此字段可能返回 null，表示取不到有效值。
     * @param YoungGC youngGC增量监控图,一条线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYoungGC(CurvePoint [] YoungGC) {
        this.YoungGC = YoungGC;
    }

    /**
     * Get fullGC增量监控图,一条线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FullGC fullGC增量监控图,一条线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CurvePoint [] getFullGC() {
        return this.FullGC;
    }

    /**
     * Set fullGC增量监控图,一条线
注意：此字段可能返回 null，表示取不到有效值。
     * @param FullGC fullGC增量监控图,一条线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFullGC(CurvePoint [] FullGC) {
        this.FullGC = FullGC;
    }

    /**
     * Get cpu使用率,一条线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuUsage cpu使用率,一条线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CurvePoint [] getCpuUsage() {
        return this.CpuUsage;
    }

    /**
     * Set cpu使用率,一条线
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuUsage cpu使用率,一条线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuUsage(CurvePoint [] CpuUsage) {
        this.CpuUsage = CpuUsage;
    }

    /**
     * Get 加载类数,一条线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassCount 加载类数,一条线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CurvePoint [] getClassCount() {
        return this.ClassCount;
    }

    /**
     * Set 加载类数,一条线
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassCount 加载类数,一条线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassCount(CurvePoint [] ClassCount) {
        this.ClassCount = ClassCount;
    }

    public JvmMonitorData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JvmMonitorData(JvmMonitorData source) {
        if (source.HeapMemory != null) {
            this.HeapMemory = new MemoryPicture(source.HeapMemory);
        }
        if (source.NonHeapMemory != null) {
            this.NonHeapMemory = new MemoryPicture(source.NonHeapMemory);
        }
        if (source.EdenSpace != null) {
            this.EdenSpace = new MemoryPicture(source.EdenSpace);
        }
        if (source.SurvivorSpace != null) {
            this.SurvivorSpace = new MemoryPicture(source.SurvivorSpace);
        }
        if (source.OldSpace != null) {
            this.OldSpace = new MemoryPicture(source.OldSpace);
        }
        if (source.MetaSpace != null) {
            this.MetaSpace = new MemoryPicture(source.MetaSpace);
        }
        if (source.ThreadPicture != null) {
            this.ThreadPicture = new ThreadPicture(source.ThreadPicture);
        }
        if (source.YoungGC != null) {
            this.YoungGC = new CurvePoint[source.YoungGC.length];
            for (int i = 0; i < source.YoungGC.length; i++) {
                this.YoungGC[i] = new CurvePoint(source.YoungGC[i]);
            }
        }
        if (source.FullGC != null) {
            this.FullGC = new CurvePoint[source.FullGC.length];
            for (int i = 0; i < source.FullGC.length; i++) {
                this.FullGC[i] = new CurvePoint(source.FullGC[i]);
            }
        }
        if (source.CpuUsage != null) {
            this.CpuUsage = new CurvePoint[source.CpuUsage.length];
            for (int i = 0; i < source.CpuUsage.length; i++) {
                this.CpuUsage[i] = new CurvePoint(source.CpuUsage[i]);
            }
        }
        if (source.ClassCount != null) {
            this.ClassCount = new CurvePoint[source.ClassCount.length];
            for (int i = 0; i < source.ClassCount.length; i++) {
                this.ClassCount[i] = new CurvePoint(source.ClassCount[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HeapMemory.", this.HeapMemory);
        this.setParamObj(map, prefix + "NonHeapMemory.", this.NonHeapMemory);
        this.setParamObj(map, prefix + "EdenSpace.", this.EdenSpace);
        this.setParamObj(map, prefix + "SurvivorSpace.", this.SurvivorSpace);
        this.setParamObj(map, prefix + "OldSpace.", this.OldSpace);
        this.setParamObj(map, prefix + "MetaSpace.", this.MetaSpace);
        this.setParamObj(map, prefix + "ThreadPicture.", this.ThreadPicture);
        this.setParamArrayObj(map, prefix + "YoungGC.", this.YoungGC);
        this.setParamArrayObj(map, prefix + "FullGC.", this.FullGC);
        this.setParamArrayObj(map, prefix + "CpuUsage.", this.CpuUsage);
        this.setParamArrayObj(map, prefix + "ClassCount.", this.ClassCount);

    }
}

