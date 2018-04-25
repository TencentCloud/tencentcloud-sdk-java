package com.tencentcloudapi.cbs.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DeleteSnapshotsRequest  extends AbstractModel{


    /**
    * 要删除的快照ID列表，可通过[DescribeSnapshots](/document/product/362/15647)查询。
    */
    @SerializedName("SnapshotIds")
    @Expose
    private String [] SnapshotIds;
    

    /**
     * 获取要删除的快照ID列表，可通过[DescribeSnapshots](/document/product/362/15647)查询。
     * @return SnapshotIds 要删除的快照ID列表，可通过[DescribeSnapshots](/document/product/362/15647)查询。
     */
    public String [] getSnapshotIds() {
        return this.SnapshotIds;
    }

    /**
     * 设置要删除的快照ID列表，可通过[DescribeSnapshots](/document/product/362/15647)查询。
     * @param SnapshotIds 要删除的快照ID列表，可通过[DescribeSnapshots](/document/product/362/15647)查询。
     */
    public void setSnapshotIds(String [] SnapshotIds) {
        this.SnapshotIds = SnapshotIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SnapshotIds.", this.SnapshotIds);

    }
}

